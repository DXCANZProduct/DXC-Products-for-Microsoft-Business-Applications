---
# required metadata

title: Smart Send
description: Smart Send - Adding custom attachments
author: Liam Coll
manager: Kym Parker
ms.date: 2021-07-29
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  
audience: Application User
# ms.devlang: 
ms.reviewer: Liam Coll

# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Liam Coll
ms.search.validFrom: : 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Adding Custom Attachments
## Overview
Smart Send uses the primary table and the email template to look for additional attachments, where document handling file type is specified against the business form in the parameters, and where the restriction of the file is set to *External*.
Smart Send also includes an extension hook to enable a customer to create an extension class to attach a document handling attached file from another source, for example Purchase/Sales order lines. This technical guide provides sample code to achieve this for Purchase order lines.

## Prerequisite
Minimum solution required is DXC Smart Business Form Email Manager Version 10.8.32.10030.

## Add Purchase Order Line Attachments to PO Confirmation
Create an extension class for the ESSReport* class. 
Below is sample code on how to add purchase order line attachments to the email.

```x++
[ExtensionOf(classStr(ESSReportPurchPurchaseOrder))]
public final class ESSReportPurchPurchaseOrder_Extension
{
    public void additionalAttachment(SysOutgoingEmailTable _sysOutgoingEmailTable, ECL_AutoPrintReportMgmt _autoPrintReportMgmt)
    {
        next additionalAttachment(_sysOutgoingEmailTable, _autoPrintReportMgmt);
        if (_sysOutgoingEmailTable.ECL_RefTableId == tablenum(VendPurchOrderJour))
        {
            VendPurchOrderJour vendPurchOrderJour = VendPurchOrderJour::findRecId(_sysOutgoingEmailTable.ECL_RefRecId);
            
            if (vendPurchOrderJour)
            {
                PurchLine purchLine;
            
                while select purchLine
                    where purchLine.PurchId == vendPurchOrderJour.PurchId
                {
                    if (purchLine)
                    {
                        SysEmailTable::essCopyAttachmentToOutgoingEmail(_sysOutgoingEmailTable.EmailItemId, _autoPrintReportMgmt.DocuFileType, purchLine.TableId, purchLine.RecId);
                    }
                }
            }
        }
    }
}
```
## Copy attachment method
Below is sample code on how to attach to an email. 

```x++
    public static void essCopyAttachmentToOutgoingEmail(
        SysEmailItemId  _emailItemId, 
        DocuTypeId      _docuType, 
        TableId         _refTableId, 
        RefRecId        _refRecId)
    {
        DocuRef                 docuRef;        
        SysOutgoingEmailData    outgoingEmailData;
        Filename                attachmentFileExtension;

        select firstonly outgoingEmailData
            order by DataId desc
            where outgoingEmailData.EmailItemId == _emailItemId;
        SysEmailDataId dataId = outgoingEmailData.DataId;

        while select docuRef
        where docuRef.RefTableId  == _refTableId && docuRef.RefRecId    == _refRecId &&
              docuRef.TypeId       == _docuType &&
              docuRef.Restriction  == DocuRestriction::External
        {
            if (docuRef.isValueAttached())
            {
                dataId++;
                outgoingEmailData.EmailItemId   = _emailItemId;
                outgoingEmailData.DataId        = dataId;
                outgoingEmailData.EmailDataType = SysEmailDataType::Attachment;
                outgoingEmailData.Data          = docuRef.getFileContentAsContainer();
                outgoingEmailData.FileName      =  docuRef.docuValue().FileName;
                attachmentFileExtension = '.' + docuRef.docuValue().FileType;
                outgoingEmailData.FileExtension = attachmentFileExtension;
                outgoingEmailData.insert();
            }
        }
   }
```
