---
layout: landing-page
header: License Manager
tagline: Comprehensive license management solution for Dynamics 365 Finance and Operations ISV products

# Intro Card Section
intro_card:
  icon: "fas fa-key"
  title: "Enterprise License Control at Your Fingertips"
  description: "License Manager enables ISV partners to efficiently manage customer licenses, control environments, track telemetry, and ensure compliance. Seamlessly integrate license validation into your D365 F&O products with real-time monitoring and automated controls."
  buttons:
    - text: "Get Started"
      url: "/licensemanager/FinOps"
      style: "primary"
    - text: "View Documentation"
      url: "/licensemanager/ReactWebApp"
      style: "outline-primary"

# Videos Section
videos:
  title: "Learn Through Videos"
  items:
    - title: "License Manager Overview"
      description: "Get a comprehensive overview of License Manager features and capabilities"
      type: "youtube"
      id: "dQw4w9WgXcQ"  # Replace with actual video ID
    - title: "Quick Start Guide"
      description: "Learn how to set up and configure License Manager in minutes"
      type: "youtube"
      id: "dQw4w9WgXcQ"  # Replace with actual video ID
    - title: "Advanced Configuration"
      description: "Deep dive into advanced features and customization options"
      type: "youtube"
      id: "dQw4w9WgXcQ"  # Replace with actual video ID

# Features Section
features:
  title: "Key Features"
  items:
    - icon: "fas fa-shield-alt"
      title: "License Control"
      description: "Implement robust license validation for your ISV products with real-time verification and automated enforcement"
      link:
        text: "Learn More"
        url: "/licensemanager/FinOps"
    - icon: "fas fa-chart-line"
      title: "Real-time Telemetry"
      description: "Collect and analyze license-based usage data to understand customer behavior and optimize your offerings"
      link:
        text: "Learn More"
        url: "/licensemanager/ReactWebApp"
    - icon: "fas fa-cloud"
      title: "Multi-Environment Support"
      description: "Manage licenses across multiple environments with centralized control and visibility"
      link:
        text: "Learn More"
        url: "/licensemanager/FinOps"
    - icon: "fas fa-cogs"
      title: "Flexible Integration"
      description: "Integrate via configuration keys or feature management with automatic deactivation for unlicensed features"
      link:
        text: "Learn More"
        url: "/licensemanager/SupportMaintenance"

# Getting Started Section
getting_started:
  title: "Getting Started in 4 Easy Steps"
  steps:
    - title: "Review Requirements"
      description: "Understand the prerequisites and system requirements for License Manager implementation"
      link:
        text: "View Requirements"
        url: "/licensemanager/FinOps"
    - title: "Install & Configure"
      description: "Follow our guided setup process to install License Manager in your D365 F&O environment"
      link:
        text: "Installation Guide"
        url: "/licensemanager/FinOps"
    - title: "Set Up Web App"
      description: "Configure the License Manager Web App to manage your customer licenses and monitor usage"
      link:
        text: "Web App Guide"
        url: "/licensemanager/ReactWebApp"
    - title: "Go Live"
      description: "Deploy to production and start managing your ISV product licenses effectively"
      link:
        text: "Deployment Guide"
        url: "/licensemanager/SupportMaintenance"

# Resources Section
resources:
  title: "Resources & Documentation"
  items:
    - icon: "fas fa-book"
      title: "FinOps Documentation"
      url: "/licensemanager/FinOps"
      link_text: "Read Docs →"
    - icon: "fas fa-laptop-code"
      title: "Web App Guide"
      url: "/licensemanager/ReactWebApp"
      link_text: "Explore →"
    - icon: "fas fa-shield-alt"
      title: "Security Configuration"
      url: "/licensemanager/Security-configuration"
      link_text: "Configure →"
    - icon: "fas fa-life-ring"
      title: "Support & Maintenance"
      url: "/licensemanager/SupportMaintenance"
      link_text: "Get Support →"
    - icon: "fas fa-question-circle"
      title: "FAQ"
      url: "/licensemanager/FAQ"
      link_text: "View FAQ →"
    - icon: "fas fa-rocket"
      title: "Release Notes"
      url: "/licensemanager/releasenotes"
      link_text: "What's New →"
---

## About License Manager

The License Manager solution provides comprehensive license management for Dynamics 365 Finance and Operations ISV products. This powerful module empowers ISV partners to:

- **Manage customer license information** with real-time updates and centralized control
- **Control expired licenses and environments** to ensure compliance and security
- **Extend license control** to each ISV product seamlessly
- **Collect license-based telemetry** for insights and analytics

### How It Works

Upon installation of license-controlled ISV products, a validation request is automatically made to the licensing service. If a product is not licensed, expired, or disabled, customers receive immediate prompts to contact the ISV partner for resolution.

### Implementation Options

License Manager offers flexible implementation through:
- **Configuration Keys**: Traditional approach for license control
- **Feature Management**: Modern feature flag-based control
- **Automatic Deactivation**: Optional feature to remove unlicensed product access

### Important Disclaimer

As a License Manager customer, you acknowledge that DXC will host customer license information in a secure, compliant environment.