```md
# Introduction to HTML5.0  

## History of HTML  
HTML (HyperText Markup Language) has evolved over time, with HTML5 being the latest version. It introduced new elements and features to improve web development, including better multimedia support, semantic elements, and enhanced accessibility.  

## Structure of HTML  
HTML documents consist of elements enclosed in tags. A basic HTML document includes:  
- `<!DOCTYPE html>` – Declares HTML5  
- `<html>` – Root element  
- `<head>` – Metadata section  
- `<body>` – Contains visible content  

## Adding Comments  
HTML comments are added using `<!-- comment -->` and are not displayed in the browser.  

## Formatting Text  
HTML provides several formatting tags, such as:  
- `<b>` – Bold  
- `<i>` – Italic  
- `<u>` – Underline  
- `<strong>` – Important text  
- `<em>` – Emphasized text  

## Creating Lists  
- **Ordered List (`<ol>`)** – Numbered list  
- **Unordered List (`<ul>`)** – Bulleted list  
- **List Item (`<li>`)** – Defines individual list items  

## Creating Definition List
## Project by Anshuman/Aman 
Definition lists use:  
- `<dl>` – Definition list container  
- `<dt>` – Definition term  
- `<dd>` – Definition description  

## Creating HyperText Links  
Hyperlinks are created using the `<a>` tag:  
```html
<a href="https://example.com">Visit Example</a>
```  

## Creating Link Lists  
Navigation menus can be created using a combination of lists and links:  
```html
<ul>
  <li><a href="page1.html">Page 1</a></li>
  <li><a href="page2.html">Page 2</a></li>
</ul>
```  

## Inserting Inline Images  
The `<img>` tag is used to add images:  
```html
<img src="image.jpg" alt="Description">
```  

## Creating Image Links  
Images can be used as links by nesting `<img>` inside `<a>`:  
```html
<a href="https://example.com"><img src="image.jpg" alt="Example"></a>
```  

## Horizontal Rules  
The `<hr>` tag creates a horizontal line to separate content.  

## Address Tag  
The `<address>` tag defines contact information.  

## Working with Text  
You can adjust text properties using HTML and CSS.  

## Changing Font Sizes and Colors  
Font size and color can be set using the `style` attribute:  
```html
<p style="font-size: 20px; color: blue;">This is styled text.</p>
```  

## Using Background Image  
The `background-image` property in CSS allows adding background images:  
```css
body {
  background-image: url('background.jpg');
}
```  

## Marquee Tag  
The `<marquee>` tag creates scrolling text (deprecated in HTML5).  

## Overview of User Experience (UX) Design  
UX design focuses on enhancing user satisfaction by improving usability, accessibility, and interaction.  

## Fundamentals of Design  
Key design principles include:  
- Contrast  
- Alignment  
- Repetition  
- Proximity  

## Overview of WordPress and WIX  
- **WordPress** – A popular CMS (Content Management System) for website creation.  
- **WIX** – A drag-and-drop website builder for easy web development.  

---  

# Module II: Tables, Iframes, and Forms  

## Creating Tables  
HTML tables are created using the `<table>` tag.  

## Table Elements  
- `<tr>` – Table row  
- `<td>` – Table data/cell  
- `<th>` – Table header  

## Adding Border  
Use the `border` attribute or CSS:  
```css
table {
  border: 1px solid black;
}
```  

## Adding Column Headings  
Column headings are defined using `<th>` inside `<tr>`.  

## Adding Spacing and Padding  
Use CSS `border-spacing` and `padding` properties to adjust spacing.  

## Adding a Caption  
The `<caption>` tag provides a title for the table.  

## Setting Table Width and Height  
Define width and height using the `width` and `height` attributes or CSS.  

## Adding Row Headings  
Use `<th>` in the first column of each row.  

## Aligning Cell Contents  
Use the `align` and `valign` attributes or CSS `text-align` and `vertical-align`.  

## Setting Column Width  
Use the `width` attribute in `<col>` or CSS.  

## Centering a Table  
Use CSS `margin: auto;` to center a table.  

## Inserting an Image in a Table  
Place `<img>` inside a `<td>`.  

## Spanning Columns and Rows  
Use `colspan` and `rowspan` attributes to merge cells.  

## Assigning Background Colors  
Use the `bgcolor` attribute or CSS `background-color` property.  

## Introduction to Forms  
Forms collect user input using the `<form>` tag.  

## Form Elements  
- `<input>` – Text fields, checkboxes, radio buttons  
- `<textarea>` – Multi-line text input  
- `<button>` – Submit button  
- `<select>` – Dropdown menu  

## Introduction to Iframes  
The `<iframe>` tag embeds other web pages inside an HTML document.  

---  

# Module III: Introduction to Cascading Style Sheets (CSS) and CSS Frameworks  

## What are Cascading Style Sheets (CSS)?  
CSS is used to style HTML elements, including layout, colors, and fonts.  

## Different Ways to Use CSS  
- **Inline CSS** – Inside an HTML tag using the `style` attribute  
- **Internal CSS** – Within a `<style>` tag inside `<head>`  
- **External CSS** – A separate `.css` file linked via `<link>`  

## Selectors, `DIV`, and `SPAN` Elements  
- **Selectors** – Target HTML elements (`p`, `h1`, `.class`, `#id`)  
- **DIV** – Block-level container  
- **SPAN** – Inline container  

## Adding Style to a Document  
Use an external or internal stylesheet to define styles.  

## Using Classes and IDs  
- **Class (`.`)** – Used for multiple elements  
- **ID (`#`)** – Used for a single unique element  

## Style Sheet Properties  
Common CSS properties include:  
- `color` – Sets text color  
- `font-size` – Adjusts font size  
- `margin` – Sets space around elements  
- `padding` – Sets space inside an element  

## Classes & Pseudo Classes  
- **Classes** (`.classname`) – Define reusable styles  
- **Pseudo-classes** (`:hover`, `:focus`) – Define special states  

## Introduction to Frameworks  
Frameworks provide pre-written CSS and JS to streamline development.  

## Why Use CSS Frameworks?  
- Saves time  
- Ensures consistency  
- Responsive and mobile-friendly  

## Types of CSS Frameworks  
1. **Front-end frameworks** – Used for UI styling (e.g., Bootstrap, Tailwind CSS)  
2. **Back-end frameworks** – Used for server-side styling  

## Framework Classification  
1. **Simple Frameworks** – Basic styles with minimal features  
2. **Responsive Frameworks** – Mobile-friendly frameworks with grid systems  

---
