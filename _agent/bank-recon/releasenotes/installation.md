---
layout: releasenotes-content
header: DXC Agent for Bank reconciliation in D365 FSCM
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
| DXC Agent for Bank reconciliation in D365 FSCM | DXC License Manager,  DXC License, DXC Agent for finance & supply chain management | 
| DXC License | DXC License Manager | 
| DXC License Manager | None |
| DXC Agent for finance & supply chain management | DXC License Manager,  DXC License |

---

```
DXC Agent for Bank reconciliation in D365 FSCM
   ├── DXC License
   │       └── DXC License Manager
   ├── DXC License Manager
   └── DXC Agent for finance & supply chain management
```

## Feature management

Enable the following feature in D365 Feature management:
- **DXC Agent for finance & supply chain management**
- **DXC Agent for bank reconciliation**

If above feature is not visible, press **Check for updates** to refresh the feature management list.
