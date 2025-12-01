---
layout: product-content
header: Electronic Data Interchange (EDI)
toc: true
---

# Process overview - Outbound

## Voyage advice
Purchase order details can be sent to the Freight forwarder, when the D365 Purchase order has a _Shipping company_ allocated that is setup as Freight forwarder landed cost Trading partner and has the outbound **Voyage advice** document setup and enabled.

# Process overview - Inbound

## Voyage creator
When a D365 Vendor of **Shipping type** set to _Shipping company_ has been loaded as a Freight forwarder landed cost Trading partner and has the incoming **Voyage creator** document setup and enabled, the freight forwarder can send the shipment details in order to create a Landed cost Voyage. 

## Voyage tracking
When a D365 Vendor of **Shipping type** set to _Shipping company_ has been loaded as a Freight forwarder landed cost Trading partner and has the inbound **Voyage tracking** document setup and enabled, the freight forwarder can send tracking detail(s) in order to update the Landed cost Voyage's tracking legs for all containers or for a particular container.

# Document errors
When an incoming staging record/document errors, it has not created/updated the target D365 transaction. <br>
When an outgoing staging record/document errors, it has not created the Outbound file. <br>

Staging/document errors can be viewed at: <br>
- **EDI > Documents** - On each document type, user can set filter **Staging to target status** to _Error_
- [**EDI > EDI Document maintenance**](../../CORE/WORKSPACES/EDI-Document-maintenance-workspace) - The workspace contains a tile and tab for each document type.

Users can use **Show log** and **Version log** to review the issues. And after the issue has been fixed, reset the status of the record. The next processing batch will pick up the _Not started_ status record.

## Fixing Staging-to-Target EDI errors 
See [FAQ](FAQ#fixing-staging-to-target-edi-errors) for example errors and possible method(s) of fixing.
