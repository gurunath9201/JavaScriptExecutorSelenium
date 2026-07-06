# Selenium JavaScript Executor Examples

This repository contains Selenium WebDriver automation examples using **Java**, **Maven**, and **JavaScriptExecutor**.

The project demonstrates how JavaScriptExecutor can be used to interact with web elements when Selenium WebDriver alone is not sufficient.

---

## 🚀 Technologies Used

- Java
- Selenium WebDriver
- Maven
- Microsoft Edge Driver
- JavaScriptExecutor

---

## 📁 Project Structure

```
src
└── test/java
    └── com
        └── pp
            ├── HighlightTestedElementswithJSExecutor.java
            ├── LoginTestWithJsExecutor.java
            ├── ScrollByPixelWithJSExecutor.java
            └── ScrollwithJSExecutor.java
```

---

## 📌 Examples Included

### 1. Highlight Web Elements

**File:**
`HighlightTestedElementswithJSExecutor.java`

Features:
- Open browser
- Locate web elements
- Enter login credentials
- Highlight button using JavaScript
- Highlight complete login panel

JavaScript Used

```javascript
arguments[0].style.border='2px solid red'
```

---

### 2. Login Using JavaScriptExecutor

**File:**
`LoginTestWithJsExecutor.java`

Features:
- Enter username using JavaScript
- Enter password using JavaScript
- Click Sign In using JavaScript
- Validate page title
- Refresh browser using JavaScript
- Display JavaScript alert

JavaScript Used

```javascript
arguments[0].value='text'
arguments[0].click()
return document.title
history.go(0)
alert('Welcome')
```

---

### 3. Scroll By Pixel

**File:**
`ScrollByPixelWithJSExecutor.java`

Features:
- Scroll webpage vertically
- Read text after scrolling

JavaScript Used

```javascript
window.scrollBy(0,950)
```

---

### 4. Scroll to Bottom

**File:**
`ScrollwithJSExecutor.java`

Features:
- Scroll to bottom of page
- Locate footer
- Read footer text
- Demonstrates scrolling using JavaScript

JavaScript Used

```javascript
window.scrollTo(0,document.body.scrollHeight)
```

---

## 📦 Maven Dependency

```xml
<dependencies>

    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.21.0</version>
    </dependency>

</dependencies>
```

---

## ▶️ How to Run

1. Clone the repository

```bash
git clone https://github.com/gurunath9201/JavaScriptExecutorSelenium.git
```

2. Open the project in Eclipse or IntelliJ IDEA.

3. Update the EdgeDriver if required.

4. Run any Java class as a Java Application.

---

## 📚 JavaScriptExecutor Methods Used

| Method | Purpose |
|---------|---------|
| executeScript() | Execute JavaScript code |
| arguments[0].value | Set input field value |
| arguments[0].click() | Click element |
| arguments[0].style.border | Highlight element |
| window.scrollBy() | Scroll by pixels |
| window.scrollTo() | Scroll to page bottom |
| document.title | Get page title |
| history.go(0) | Refresh page |
| alert() | Display alert |

---

## 🎯 Learning Objectives

This project helps in understanding:

- Selenium JavaScriptExecutor
- Handling hidden or difficult elements
- Highlighting web elements
- JavaScript-based clicking
- JavaScript-based typing
- Scrolling web pages
- Retrieving page information using JavaScript
- Browser control using JavaScript

---

## 👨‍💻 Author

**Gurunath Mule**

---

## ⭐ If you found this project useful

Give this repository a ⭐ on GitHub.

Happy Learning! 🚀
