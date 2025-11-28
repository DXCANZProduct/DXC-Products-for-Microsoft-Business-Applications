---
layout: releasenotes-content
header: Care Services
title: Archive
release-version: 10.0.43.20250617
markAsPrevious: true
toc: true
---

### Release 10.0.43.20250617

#### Build 10.0.43.202506173

<ins>Bug fixes</ins>

Number	  | Name	          | Description
:--       |:--              |:--
23045|Funding Journal not filtering correct Funding Code|updated selection criteria so the correct description is pulled through when the same funding code is used 
22985|update to unique Key for funding code |Allows  the same funding code to be used with a different billing account name; previously, this was unavailable
23033|General Ledger Journal affected by Care Services deployment|corrected view issue in standard General Journal
23016|Service Entry Validations Enhancement|updated reference for a small group of statements
22986|Smart send requirements are not present for the Care Services billing Statement|updates to Smart Send extensions for Care Services
22653|Client refund proposal is not filtering transactions based on the selected accommodation payment ID|The form will filter on the accommodation payment ID and service code


<ins>New features</ins>

Number	  | Name	          | Description
:--       |:--              |:--
23016|Service Entry Validations Enhancement|removed limitations that would normally restrict service entry types, enhancing integration with third-party systems 
22989|Care Services Statement can display different  Organisation address|New functionality is added to the Care services parameters page ( Care services >Setup >Care services parameters) that allows an organisation to display a different organisational address on their statements
22763|Client Refund Proposal|added toggle to allow for all open transactions to be displayed 
23129|Client Refund Proposal Journal description field should populate from billing code| The source for the population of the description text for the refund journal will include the description on the billing code that has been used for the refund journal.

### Release 10.0.42.20250509
#### Build 10.0.42.202505091