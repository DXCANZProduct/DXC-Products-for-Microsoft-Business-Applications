---
# required metadata

title: Smart Send
description: Smart Send - Email placeholder
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
# ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Liam Coll
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Email Placeholder
Placeholder tags are variables that are dynamically replaced during the execution of the business forms or reports. The following fields support placeholder tags:
* Email Subject
* Email body
* Filename
* Azure blob storage folder name

## Fixed List Placeholder Tokens
Each of the Smart Send supported documents have a fixed list of tags. These are listed below:

|  **Document**  | **Fixed token** | 
|:---|:---|     
|  **Sales Agreement Confirmation**  | Created Date %CreatedDate% <br/> Customer Account %CustAccount% <br/> Delivery Name %DeliveryName% <br/> Effective Date %EffectiveDate% <br/> Expiration Date %ExpirationDate% <br/> Invoice Account %InvoiceAccount% <br/> Sales Agreement %SalesAgreement% |
|  **Sales Quotation**  | Quotation Id: %QuotationId% <br/> Quotation Document Number: %QuotationDocNum% <br/> Invoice Account: %InvoiceAccount% <br/> Delivery Name: %DeliveryName% <br/> Quotation Date: %QuotationDate% <br/> Deadline: %Deadline% <br/> Created Date: %CreatedDate% |
|  **Sales Order Confirmation**  | Confirmation Id: %ConfirmationId% <br/> Sales Id: %SalesId% <br/> Invoice Account: %InvoiceAccount% <br/> Delivery Name: %DeliveryName% <br/> Confirmation Date: %ConfirmDate% <br/> Purchase Order: %PurchaseOrder% <br/> Created Date: %CreatedDate% |
|  **Sales Return Order/Return Acknowledgement**  | RMA Number: %ReturnItemNum% <br/> Customer account: %CustAccount% <br/> Sales name: %SalesName% <br/> Customer account name: %CustAccountName% <br/> Invoice account: %InvoiceAccount% <br/> Invoice account name: %InvoiceAccountName% <br/> Customer reference: %CustomerRef% <br/> Replacement reference: %ReturnReplacementId% <br/> Sales taker: %WorkerSalesTakerName% <br/> Return deadline: %ReturnDeadline% |
|  **Sales Packing Slip**  | Order Account: %OrderAccount% <br/> Delivery Name: %DeliveryName% <br/> Invoice Account: %InvoiceAccount% <br/> Invoice Name: %InvoiceAccountName% <br/> Ship Date: %ShipDate% <br/> Sales Id: %SalesId% <br/> Created Date: %CreatedDate% |
|  **Sales Invoice**  | Invoice Id: %InvoiceId% <br/> Invoice Account: %InvoiceAccount% <br/> Invoice Account Name: %InvoiceAccountName% <br/> Invoice Date: %InvoiceDate% <br/> Invoice Due Date: %DueDate% <br/> Created Date: %CreatedDate% |
|  **Free Text Invoice**  | Invoice Id: %InvoiceId% <br/> Invoice Account: %InvoiceAccount% <br/> Invoice Account Name: %InvoiceAccountName% <br/> Invoice Date: %InvoiceDate% <br/> Invoice Due Date: %DueDate% <br/> Created Date: %CreatedDate% |
|  **Customer Payment Advice**  | Account Number: %AccountNum% <br/> Account Name: %AccountName% <br/> Journal Number: %JournalNum% <br/> Payment Reference: %PaymentReference% <br/> Payment Advice Date: %PaymAdviceDate% |
|  **Customer Account Statement**  | Account number: %AccountNum% <br/> Account name: %AccountName% <br/> Created Date: %CreatedDate% |
|  **Collection Letter**  | Collection Letter Number %CollectionLetterNum% <br/> Account Number: %AccountNum% <br/> Account Name: %AccountName% <br/> Date: %Date% <br/> Due Date: %DueDate <br/> Total: %Total% <br/> Notes: %Notes% |
|  **Request for Quotation**  | RFQ Id: %RFQId% <br/> Account Number: %VendAccountNum% <br/> Account Name: %VendAccountName% <br/> RFQ Document Number: %RFQDocNum% <br/> RFQ Date: %RFQDate% <br/> RFQ Name: %RFQName% <br/> Vendor Reference: %VendRef% <br/> Orderer: %Orderer% <br/> Requested By Name %RequestedBy% |
|  **Purchase Order**  | Purchase Order Id: %PurchaseOrderId% <br/> Purchase Journal: %PurchaseJournal% <br/> Order Account: %OrderAccount% <br/> Delivery Name: %DeliveryName% <br/> Purchase Date: %PurchaseDate% <br/> Created Date: %CreatedDate% <br/> Requestor’s Name: %RequestorName% <br/> Requestor’s Email: %RequestorEmail% <br/> Orderer’s Name: %OrdererName% <br/> Orderer’s Email: %OrdererEmail%  |
|  **Vendor Payment Advice**  | Account Number: %AccountNum% <br/> Account Name: %AccountName% <br/> Journal Number: %JournalNum% <br/> Payment Advice Date: %PaymAdviceDate% <br/> Created Date: %CreatedDate% |
|  **Project Quotation**  | Quotation Id: %QuotationId% <br/> Quotation Document Number: %QuotationDocNum% <br/> Invoice Account: %InvoiceAccount% <br/> Prospect: %Prospect% <br/> Delivery Name: %DeliveryName% <br/> Quotation Date: %QuotationDate% <br/> Deadline: %Deadline% <br/> Project Id: %ProjectId% <br/> Project Name: %ProjectName%  |
|  **Project Invoice**  | Project Id: %ProjId% <br/> Project Name: %ProjName% <br/> Project Contract Id: %ProjContractId% <br/> Invoice Id: %InvoiceId% <br/> Invoice Account: %InvoiceAccount% <br/> Delivery Name: %DeliveryName% <br/> Invoice Date: %InvoiceDate% <br/> Due Date: %DueDate% <br/> Created Date: %CreatedDate% |
|  **Transfer Overview**  | Transfer number: %TransferId% <br/> From warehouse: %LocationNameFrom% <br/> From address: %FromAddress% <br/> To warehouse: %LocationNameTo% <br/> To address: %ToAddress% <br/> Transfer status: %TransferStatus% <br/> Ship date: %ShipDate% |
|  **Bill of Lading**  | Bill of lading Id: %BillOfLadingId% <br/> Shipment Id: %ShipmentId% <br/> Cust Account: %CustAccount% <br/> Customer name: %CustName% <br/> Delivery name: %DeliveryName% |
|  **Container Contents**  | ContainerID: %ContainerID% <br/> Shipment Id: %ShipmentId% <br/> Load Id: %LoadId% <br/> Account number: %AccountNum% <br/> Delivery name: %DeliveryName% <br/> Attribute code 1: %ContainerAttributeCode1% <br/> Attribute code 2: %ContainerAttributeCode2% <br/> Attribute code 3: %ContainerAttributeCode3% <br/> Attribute code 4: %ContainerAttributeCode4%  |
|  **Commercial Invoice**  | Invoice account: %InvoiceAccount% <br/> Total value: %TotalValue% <br/> Account number: %AccountNum% <br/> Customer name: %CustName% <br/> Invoice address: %InvoiceAddress% <br/> Order number: %OrderNum% <br/> Shipment Id: %ShipmentId% <br/> Shipment date: %ShipmentDateTime% <br/> Delivery name: %DeliveryName% <br/> Delivery address: %DeliveryAddress% |
|  **Packing List**  | Shipment Id: %ShipmentId% <br/> Number of containers: %NumberOfContainers% <br/> Account number: %AccountNum% <br/> Customer name: %CustName% <br/> Order number: %OrderNum% <br/> Shipment date: %ShipmentDateTime% <br/> Delivery name: %DeliveryName% <br/> Delivery address: %DeliveryAddress% |
|  **Vendor Invoice**  | Invoice Id: %InvoiceId% <br/> Created Date: %CreatedDate% <br/> Invoice Due Date: %DueDate% <br/> Invoice Date: %InvoiceDate% <br/> Invoice Account Name: %InvoiceAccountName% <br/> Invoice Account: %InvoiceAccount% |
 	

## Dynamic Placeholder Tokens

Smart Send also supports dynamic place holder tags using the table and field names. This is helpful in advanced scenarios where the fixed list tags are not sufficient. It could avoid further development.
Enter the query default table name and field name in the format of %TableName.FieldName%. Similarly, display method can also be used with the format %TableName.MethodName#%.
For example, an account number can be retrieved using %CustTable.AccountNum% and the name can be retrieved using %CustTable.name#%.
Below are some common documents with their primary table.

|  **Document**  | **Table name** | 
|:---|:---|     
|  **Free Text Invoice**  | CustInvoiceJour  |  
|  **Sales Agreement Confirmation**  | SalesAgreementHeaderHistory |  
|  **Sales Quotation**  | CustQuotationJour |  
|  **Sales Order**  | CustConfirmJour |  
|  **Sales Return Order/Return Acknowledgement**  | SalesTable |  
|  **Sales Order Packing Slip**  | CustPackingSlipJour |  
|  **Sales Invoice**  | CustInvoiceJour |  
|  **Customer Account Statement**  | CustTable | 
|  **Customer Payment Advice**  | LedgerJournalTrans | 
|  **Collection Letter**  | CustCollectionLetterJour | 
|  **Request for Quotation**  | VendRFQJour | 
|  **Purchase Order Confirmation**  | VendPurchOrderJour | 
|  **Vendor Payment Advice**  | LedgerJournalTrans | 
|  **Project Quotation**  | CustQuotationJour | 
|  **Project Invoice**  | ProjInvoiceJour | 
|  **Transfer Overview**  | InventTransferTable | 
|  **Bill of Lading**  | WHSBillOfLading |
|  **Container Contents**  | WHSContainerTable | 
|  **Vendor invoice**  | VendInvoiceJournal | 

To get the full list of possible dynamic placeholder tokens, click on the “Show token placeholders” button.
 
An info message will show. Click on Message details to see the full list. The list shows the token and the label from the primary table.
