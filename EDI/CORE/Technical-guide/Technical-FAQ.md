---
# required metadata

title: [EDI]
description: [Technical guide - FAQ]
author: [jdutoit2]
manager: Kym Parker
ms.date: 20/06/2022
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [Operations AOT form name to tie this topic to]
audience: [Application User]
# ms.devlang: 
ms.reviewer: [jdutoit2]
ms.search.scope: [Which Operations client to show this topic as help for, to be set by content strategist, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
ms.search.region: [Global for most topics. Set Country/Region name for localizations]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [author's Microsoft alias]
ms.search.validFrom: [month/year of release that feature was introduced in, in format yyyy-mm-dd]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
---

# Technical FAQ

## Adding fields to an existing EDI document

Additional fields can be added to staging header and/or line table(s). Classes that need to be updated can be found by using references on other/similar fields from the applicable staging table(s). For instance references for DeliveryName on below screenshot.

![Example](../Image/Technical-FAQ-1.png "Example")

The SAB_EDIStagingTableFieldMetaData table will be updated by the **Refresh EDI module** button on the **EDI parameters** form after staging fields were added.
 
Build model with changes, with DB sync option checked. <br> 
Check-in changes and build deployable package and deploy to UAT and after sign-off to Prod systems.

## Adding an XML declaration to an XSLT output


https://our.umbraco.com/forum/templating/templates-and-document-types/10621-How-to-have-a-template-have-an-xml-header#comment-38842

\<?xml version="1.0" encoding="utf-8"?>

\<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

\<xsl:template match="/">

**<xsl:text disable-output-escaping="yes">&lt;?xml version="1.0" encoding="utf-8"?&gt;</xsl:text>**

        \<Purord>

…

Line breaks improves output: <xsl:text disable-output-escaping="yes">&lt;?xml version="1.0" encoding="utf-8"?&gt;&**#xD;&#xA**;</xsl:text>

## 'Insert into' SQL errors on views

Run full DB sync

## Deployment issues

Standard actions you can try:

1. Try to repeat the deploy one more time and/or restart UAT VM in case if something went wrong and the file mentioned  is really locked by some system process
1. If still doesn’t work, follow the recommended implementation steps as per [release notes](../../Release-notes.md#installation-process) (example remove source code of previous EDI version)

## Deployment issues with model source code

1. Redeploy binaries from the package
2. Add SFTP folder to check-in and <br>
3.1. Check-in code without local build if you wish to have source code remain on the DEV system OR <br>
3.2. Remove source code from the DEV system first and then redeploy binaries

