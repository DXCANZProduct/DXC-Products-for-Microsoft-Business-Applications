---
layout: releasenotes-content
header: Security Insights for D365 FO
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
| DXC Security Insights for D365FO | DXC License Manager,  DXC License | 
| DXC License | DXC License Manager | 
| DXC License Manager | None |

---

```
DXC Security Insights for D365FO
   ├── DXC License
   │       └── DXC License Manager
   └── DXC License Manager
```

## Feature management

Enable the following feature in D365 Feature management:
- **Security Insights for D365FO**

If above feature is not visible, press **Check for updates** to refresh the feature management list.
