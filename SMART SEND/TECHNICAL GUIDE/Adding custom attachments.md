---
# required metadata

title: [Smart Send]
description: [Smart Send - Adding custom attachments]
author: [Liam Coll]
manager: Kym Parker
ms.date: 29/07/2021
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [Smart Send]
audience: [Application User]
# ms.devlang: 
ms.reviewer: [Liam Coll]
ms.search.scope: [Which Operations client to show this topic as help for, to be set by content strategist, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
ms.search.region: [Global]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [Liam Coll]
ms.search.validFrom: [September 2017]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
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
