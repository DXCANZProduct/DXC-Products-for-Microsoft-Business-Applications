---
layout: releasenotes-content
header: Smart Business Form Email Manager (SmartSend)
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
| Smart Send | DXC License Manager,  DXC License,  DXC Connections | 
| DXC Connections | None | 
| DXC License | DXC License Manager | 
| DXC License Manager | None |

---

```
Smart Send
   ├── DXC Connections
   ├── DXC License
   │       └── DXC License Manager
   └── DXC License Manager
```

## Feature management
From 10.0.34.20231026, Smart Send can be enabled via Feature management
Enable the following feature in D365 Feature management:

- DXC Smart Send

If the above feature is not visible, press **Check for updates** to refresh the feature management list.

