---
layout: releasenotes-content
header: Electronic Data Interchange (EDI)
title: Installation process
state: current
toc: true
---

# Installation process

See [FAQ](../../FAQ#installation-process) 

# ISV Product Dependency Documentation

## 1. Overview
Provide a brief description of the ISV solution and how dependencies are structured.

---

## 2. Dependency Summary Table

| Product / Module | Depends On |
|------------------|------------|
| DXC EDI | DXC License Manager,  DXC License,  DXC Connections | 
| DXC Connections | None | 
| DXC License | DXC License Manager | 
| DXC License Manager | None |

---

```
DXC EDI
   ├── DXC Connections
   ├── DXC License
   │       └── DXC License Manager
   └── DXC License Manager
```

## Feature management
Enable all licensed modules via Feature management. Features are called:
- EDI (enable first)
- EDI – 3PL Documents
- EDI – Customer documents
- EDI – Vendor documents
- EDI – Freight forwarder landed cost documents
- EDI – Standard formats

If above features are not visible, press **Check for updates** to refresh the feature management list.

## Refresh EDI module
**EDI > Setup > EDI parameters** <br>
After each deployment, click **Refresh module**. <br>
This will flush EDI caches and refresh EDI module metadata such as EDI document types, XML structures, field names etc.


