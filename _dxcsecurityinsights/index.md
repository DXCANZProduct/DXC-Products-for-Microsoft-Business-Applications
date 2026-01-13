---
layout: product-content
header: Security Insights for D365 FO
toc: true
---

## Introduction

Security Insights for D365FO ingests user behavior data from Azure Application Insights for security analysis. <br>
Actively monitor user role assignments and utilization, thus enabling power users to optimize licensing and security of end users. <br>
Identify and maintain underutilized/unused roles, duties, privileges that have enterprise licenses attached. <br> 
<br>
Determine if users are utilising their assigned licenses effectively by fetching user menu access telemetry from Azure Applications Insights for selected time-period. Ability to view % utilisation on menu items, privileges, duties, user roles and overall user level. Can also view user’s menu item interaction type (viewed vs. edited), interaction count and last interaction date. To speed up the process of finding optimisation opportunities the solution is capable of grouping the users into logic groups based on a range of criteria like security access in Finance and operations.


### Topics
- [Setup]({{ '/dxcsecurityinsights/Parameters' | relative_url }}) - Setup Azure Application Insights and Security Insights in D365 FO
- [Monitor]({{ '/dxcsecurityinsights/Review' | relative_url }}) - Colate and review user access and security utilization
- [Security diagnostics]({{ '/dxcsecurityinsights/Security-diagnostics' | relative_url }}) - Licensing information added to Security diagnostics to assist in allocating new roles to users going forward

### Demonstration

Watch DXC Technology’s short demonstration on Security Insights for D365 FO solution here:
- [Webinar](https://dynamics.dxc.technology/webinars/security-insights-for-d365fo)
- [Demo playlist](https://www.youtube.com/playlist?list=PLIM01nS-jtL-D-wvUbmncSwy3PYjLuig5)


<iframe
	width="560"
	height="315"
	src="https://www.youtube-nocookie.com/embed/3UfacOHGWr8?rel=0&modestbranding=1{% if site.url %}&origin={{ site.url | uri_escape }}{{ site.baseurl | default: '' }}{% endif %}"
	title="Security Insights for D365 FO Demo"
	referrerpolicy="strict-origin-when-cross-origin"
	allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share"
	frameborder="0"
	allowfullscreen>
</iframe>
