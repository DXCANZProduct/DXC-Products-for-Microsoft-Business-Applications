---
layout: releasenotes-content
header: Core Extensions
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
| DXC Core Extensions | DXC License Manager,  DXC License | 
| DXC License | DXC License Manager | 
| DXC License Manager | None |

---

```
DXC Core Extensions
   ├── DXC License
   │       └── DXC License Manager
   └── DXC License Manager
```

## Feature management
Enable the following features in D365 Feature management:
- Core extensions
- (Preview) Core Extensions - Data anonymization (available on request)

If above features are not visible, press **Check for updates** to refresh the feature management list.

