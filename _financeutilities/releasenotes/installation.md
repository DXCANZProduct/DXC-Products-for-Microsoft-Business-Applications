---
layout: releasenotes-content
header: Finance Utilities
title: Installation process
state: current
toc: true
---

# Installation process

See [FAQ](../../FAQ#installation-process) 

# ISV Product Dependency

Dependency Summary Table

| Product / Module | Depends On |
|------------------|------------|
| DXC Finance Utilities | DXC License Manager,  DXC License,  DXC Connections, DXC Encryption, DXC ABN Validation | 
| DXC Connections | None | 
| DXC Encryption  | None |
| DXC ABN Validation | None | 
| DXC License | DXC License Manager | 
| DXC License Manager | None |

---

```
DXC Finance Utilities
   ├── DXC Connections
   ├── DXC Encryption
   ├── DXC ABN Validation
   ├── DXC License
   │       └── DXC License Manager
   └── DXC License Manager
```


## Feature management
Enable the following features in D365 Feature management:
- Finance utilities
- Finance utilities - AR utilities (additional license option, included in subscription)

If above feature is not visible, press **Check for updates** to refresh the feature management list.

