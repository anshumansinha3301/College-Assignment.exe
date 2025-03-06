Here are the answers in Markdown format:

```md
# 11. XML Document for an E-commerce Product Catalog with XSLT Stylesheet

## XML Document (`catalog.xml`)
```xml
<?xml version="1.0" encoding="UTF-8"?>
<?xml-stylesheet type="text/xsl" href="catalog.xsl"?>
<catalog>
    <product>
        <id>101</id>
        <name>Smartphone</name>
        <price>299.99</price>
        <category>Electronics</category>
    </product>
    <product>
        <id>102</id>
        <name>Laptop</name>
        <price>799.99</price>
        <category>Computers</category>
    </product>
</catalog>
```

## XSLT Stylesheet (`catalog.xsl`)
```xml
<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <head>
                <title>Product Catalog</title>
            </head>
            <body>
                <h2>Product Catalog</h2>
                <table border="1">
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Price</th>
                        <th>Category</th>
                    </tr>
                    <xsl:for-each select="catalog/product">
                        <tr>
                            <td><xsl:value-of select="id"/></td>
                            <td><xsl:value-of select="name"/></td>
                            <td><xsl:value-of select="price"/></td>
                            <td><xsl:value-of select="category"/></td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
```

---

# 12. PHP Script for User Registration

```php
<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "ecommerce";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// Form submission handling
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $name = $_POST['name'];
    $email = $_POST['email'];
    $password = password_hash($_POST['password'], PASSWORD_DEFAULT);

    // Validate inputs
    if (!filter_var($email, FILTER_VALIDATE_EMAIL)) {
        die("Invalid email format");
    }

    // Insert into database
    $sql = "INSERT INTO users (name, email, password) VALUES ('$name', '$email', '$password')";

    if ($conn->query($sql) === TRUE) {
        echo "Registration successful!";
    } else {
        echo "Error: " . $sql . "<br>" . $conn->error;
    }
}

$conn->close();
?>
```

---

# 13. Error Handling in JavaScript

Error handling in JavaScript is done using the `try...catch` statement, which helps catch and manage errors to prevent script crashes.

### Example:
```js
try {
    let x = 10 / 0; // Division by zero
    console.log(x);
    
    let y = undefinedVariable; // This will cause an error
} catch (error) {
    console.error("An error occurred:", error.message);
} finally {
    console.log("This block runs regardless of an error.");
}
```
- `try` block contains the code that may throw an error.
- `catch` block handles the error if it occurs.
- `finally` block executes code after `try` and `catch`, regardless of errors.

---

# 14. Differences Between Absolute, Relative, and Fixed Positioning in CSS

| Position Type  | Description |
|---------------|-------------|
| **Absolute** | The element is positioned relative to its nearest positioned (non-static) ancestor. If no such ancestor exists, it is positioned relative to the document. |
| **Relative** | The element is positioned relative to its normal position, allowing it to be moved without affecting other elements. |
| **Fixed** | The element is positioned relative to the viewport and does not move when the page is scrolled. |

### Example:
```css
.absolute {
    position: absolute;
    top: 50px;
    left: 50px;
}

.relative {
    position: relative;
    top: 20px;
    left: 20px;
}

.fixed {
    position: fixed;
    top: 0;
    right: 0;
    width: 100px;
    background-color: red;
}
```

---

# 15. Bootstrap and Its Role in Web Design

Bootstrap is a popular front-end framework that helps developers build responsive and mobile-friendly websites quickly. It provides a set of pre-designed components like buttons, grids, and forms, as well as utilities for styling.

### Key Features of Bootstrap:
- **Responsive Grid System** for layout design.
- **Pre-styled Components** like navbars, modals, and forms.
- **JavaScript Plugins** for interactive elements.
- **Customization Options** with SCSS variables.

### Example Usage:
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <title>Bootstrap Example</title>
</head>
<body>
    <div class="container">
        <h1 class="text-primary">Hello, Bootstrap!</h1>
        <button class="btn btn-success">Click Me</button>
    </div>
</body>
</html>
```

Bootstrap simplifies web design and ensures that websites look good on all devices.

---
