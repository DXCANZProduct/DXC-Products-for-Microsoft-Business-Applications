---
layout: product-content
header: Care Services
toc: true
---
# Guidelines
## Sample header
<!-- HTML vs Markdown Headings Example -->

<!-- HTML headings give you more control and can include custom classes or inline styles, but are less portable and readable in raw form. -->
<h1>Header 1 (HTML)</h1>
<h2>Header 2 (HTML)</h2>
<h3>Header 3 (HTML)</h3>
<h4>Header 4 (HTML)</h4>
<h5>Header 5 (HTML)</h5>
<h6>Header 6 (HTML)</h6>

<!-- Markdown headings are easier to write and read in plain text, and are automatically converted to the correct HTML. -->
# Header 1 (Markdown)
## Header 2 (Markdown)
### Header 3 (Markdown)
#### Header 4 (Markdown)
##### Header 5 (Markdown)
###### Header 6 (Markdown)

> Use HTML headings if you need extra attributes or styling.  
> Use Markdown headings for simplicity and readability in documentation.

## Sample text
This is a sample paragrap
h. You can use **bold**, *italic*, or `inline code` for emphasis.

## Notes
>> This is a blockquote. Use it to highlight important information or quotes.

> [!NOTE]
> Visual Studio preserves the value for the options next time you create the project based on the same template...

> 💡 **Note:** Visual Studio preserves the value for the options next time you create the project based on the same template...

<div style="background: #f5e6ff; border: 1px solid #b48fd4; padding: 1.2em 1em; border-radius: 8px; margin: 1.5em 0;">
  <strong>Note:</strong> Visual Studio preserves the value for the options next time you create the project based on the same template...
</div>

## Bullet list
- Bullet list item 1
- Bullet list item 2
  - Nested bullet item

## Numbered list
1. Numbered list item 1
2. Numbered list item 2

## Link example
[This is a link to Google](https://www.google.com)

## Relative url  
[Care services]({{'careservices/' | relative_url}})

## Sample image  
![Sample Image](./IMAGES/DXC_Logo_PurpleBlackWhite.png)

## Table Example

| Name      | Role      | Location   |
|-----------|-----------|------------|
| Alice     | Developer | New York   |
| Bob       | Designer  | London     |

---

## Code block
```python
# This is a code block
def hello():
    print('Hello, world!')
```

## Customized in-line styling  
<a href="/contact" style="display:inline-block; background:#5F249F; color:#fff; padding:12px 24px; border-radius:6px; text-decoration:none; font-weight:bold;">Contact Us</a>

## Organize with columns (HTML)  
<div style="display:flex; gap:2rem;">
  <div style="flex:1;">
    <h3>Feature 1</h3>
    <p>Short description.</p>
  </div>
  <div style="flex:1;">
    <h3>Feature 2</h3>
    <p>Short description.</p>
  </div>
</div>

## Use color blocks for emphasis  
<div style="background:#f5f5f5; padding:1rem; border-radius:8px;">
  <strong>Tip:</strong> You can use color blocks to highlight information.
</div>

## Use emoji or small images  
- 🚀 Fast setup
- 🔒 Secure
- ☎️ 24/7 Support

Emojis can be found here, copy and paste  
[Emojipedia](https://emojipedia.org/)

## Use width in % for images to make them responsive  
<img src="./IMAGES/DXC_Logo_PurpleBlackWhite.png" style="width:100%; max-width:400px; border-radius:8px;" alt="Responsive Example">