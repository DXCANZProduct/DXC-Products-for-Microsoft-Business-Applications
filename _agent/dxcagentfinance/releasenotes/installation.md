---
layout: releasenotes-content
header: DXC Agent for Finance in D365 FSCM
title: Installation process
release-version: 10.0.1
state: current
toc: true
---

# Installation process

See [FAQ](../../FAQ#installation-process) 

# ISV Product Dependency

Dependency Summary Table

| Product / Module | Depends On |
|------------------|------------|
| DXC Agent For Finance | DXC License Manager,  DXC License, DXC Agent for FSCM | 
| DXC License | DXC License Manager | 
| DXC License Manager | None |
| DXC Agent for FSCM | DXC License Manager,  DXC License |

---

```
DXC Agent For Finance
   ├── DXC License
   │       └── DXC License Manager
   ├── DXC License Manager
   └── DXC Agent for FSCM
```

## Feature management

Enable the following features in D365 Feature management (if licensed):
- **DXC Agent for finance & supply chain management**

The following can be enabled in any order:
- **DXC Agent for bank reconciliation**
- **DXC Agent for bank reconciliation voucher generation**

If above features are not visible, press **Check for updates** to refresh the feature management list.
