Here are your notes in Markdown format:  

```md
# HTML and CSS Notes

## HTML Boilerplate
An HTML boilerplate is a basic template for an HTML document. It includes the essential elements needed for a webpage.

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <h1>Hello, World!</h1>
</body>
</html>
```

---

## HTML Table
Tables in HTML are used to display data in rows and columns.

```html
<table border="1">
    <tr>
        <th>Name</th>
        <th>Age</th>
    </tr>
    <tr>
        <td>Alice</td>
        <td>25</td>
    </tr>
    <tr>
        <td>Bob</td>
        <td>30</td>
    </tr>
</table>
```

### Table Elements:
- `<table>`: Defines a table.
- `<tr>`: Defines a row.
- `<th>`: Defines a header cell.
- `<td>`: Defines a data cell.

---

## HTML Image (`<img>` tag)
The `<img>` tag is used to embed images in a webpage.

```html
<img src="image.jpg" alt="Description of image" width="300" height="200">
```

### Attributes:
- `src`: Specifies the image file path.
- `alt`: Provides alternative text for accessibility.
- `width` & `height`: Define the dimensions of the image.

---

## HTML Hyperlink (`<a>` tag)
Hyperlinks are created using the `<a>` tag.

```html
<a href="https://www.example.com" target="_blank">Visit Example</a>
```

### Attributes:
- `href`: Specifies the URL of the link.
- `target="_blank"`: Opens the link in a new tab.

---

# CSS Notes

## CSS Selectors and Their Types
Selectors in CSS are used to target HTML elements for styling.

### 1. **Universal Selector (`*`)**
```css
* {
    margin: 0;
    padding: 0;
}
```

### 2. **Element Selector**
```css
p {
    color: blue;
}
```

### 3. **Class Selector (`.`)**
```css
.my-class {
    font-size: 20px;
}
```

### 4. **ID Selector (`#`)**
```css
#my-id {
    background-color: yellow;
}
```

### 5. **Group Selector (`,`)**
```css
h1, h2, p {
    text-align: center;
}
```

### 6. **Child Selector (`>` )**
```css
div > p {
    color: green;
}
```

### 7. **Descendant Selector (Space)**
```css
div p {
    font-weight: bold;
}
```

### 8. **Adjacent Sibling Selector (`+`)**
```css
h1 + p {
    color: red;
}
```

### 9. **General Sibling Selector (`~`)**
```css
h1 ~ p {
    color: purple;
}
```

---

## Padding in CSS
Padding is the space inside the element, between the content and the border.

```css
div {
    padding: 20px; /* Padding on all sides */
    padding: 10px 15px; /* Vertical | Horizontal */
    padding: 10px 15px 20px; /* Top | Horizontal | Bottom */
    padding: 10px 15px 20px 25px; /* Top | Right | Bottom | Left */
}
```

---

## Borders in CSS
Borders define the outline of an element.

```css
div {
    border: 2px solid black; /* Width | Style | Color */
    border-radius: 10px; /* Rounded corners */
}
```

### Border Styles:
- `solid`
- `dashed`
- `dotted`
- `double`
- `groove`
- `ridge`

---

## Alignment in CSS
Alignment is used to position elements within their containers.

### Text Alignment:
```css
p {
    text-align: center; /* left | right | center | justify */
}
```

### Centering a Block Element:
```css
div {
    margin: 0 auto;
    width: 50%;
}
```

### Flexbox Centering:
```css
.container {
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
}
```
