# Abstract Classes in Java

## 1. Definition

An **abstract class** in Java is a class declared with the `abstract` keyword. It serves as a blueprint or template for other classes and represents an incomplete implementation that must be extended by subclasses.

### Core Principles
- **Cannot Be Instantiated:** You cannot create an object directly using `new AbstractClassName()`.
- **Partial Abstraction:** Unlike pure interfaces (pre-Java 8), an abstract class can contain both:
  - **Abstract methods:** Methods declared without a body (no curly braces `{}`).
  - **Concrete methods:** Fully implemented methods with a body.
- **Inheritance Requirement:** To use an abstract class, another class must extend it via the `extends` keyword and provide concrete implementations for all inherited abstract methods (unless the subclass itself is also declared `abstract`).

---

## 2. Key Characteristics & Rules

| Feature | Rule in Abstract Classes |
| :--- | :--- |
| **Instantiation** | Cannot be instantiated directly with `new`. |
| **Constructors** | **Allowed.** Abstract classes have constructors called via `super()` when a subclass object is instantiated. |
| **Instance Variables** | Can have state: instance variables (`private`, `protected`, `public`), `static` variables, and constants (`final`). |
| **Methods** | Can have both `abstract` and concrete (non-abstract) methods. |
| **Access Modifiers** | Methods and fields can use `public`, `protected`, default (package-private), and `private` (though abstract methods cannot be `private`). |
| **Static & Final Methods** | Can contain `static` and `final` methods. However, abstract methods **cannot** be declared `static` or `final`. |

---

## 3. Basic Syntax and Structure

```java
// Abstract class declaration
abstract class PaymentGateway {
    
    // 1. Instance variables (state)
    protected double transactionFeeRate;

    // 2. Constructor
    public PaymentGateway(double transactionFeeRate) {
        this.transactionFeeRate = transactionFeeRate;
    }

    // 3. Abstract method (contract: MUST be overridden by subclasses)
    public abstract void processPayment(double amount);

    // 4. Concrete method (shared behavior: inherited as-is or optionally overridden)
    public double calculateFee(double amount) {
        return amount * transactionFeeRate;
    }
}
```

---

## 4. Step-by-Step Implementation Example

Consider an enterprise document-export system supporting formats like PDF and CSV.

### Step 1: Define the Abstract Base Class

The base class defines a standard workflow using the **Template Method Pattern**, leaving specific format rendering to subclasses.

```java
// File: DocumentExporter.java
public abstract class DocumentExporter {
    
    private final String documentName;

    public DocumentExporter(String documentName) {
        this.documentName = documentName;
    }

    // Concrete method: getter
    public String getDocumentName() {
        return documentName;
    }

    // Abstract method: format-specific header formatting
    protected abstract void writeHeader();

    // Abstract method: format-specific body serialization
    protected abstract void writeContent(String content);

    // Abstract method: format-specific footer
    protected abstract void writeFooter();

    // Template method: defines the overall export algorithm
    public final void export(String content) {
        System.out.println("Starting export for: " + documentName);
        writeHeader();
        writeContent(content);
        writeFooter();
        System.out.println("Export completed successfully.\n");
    }
}
```

---

### Step 2: Implement Concrete Subclasses

#### Subclass A: PDF Exporter
```java
// File: PdfExporter.java
public class PdfExporter extends DocumentExporter {

    public PdfExporter(String documentName) {
        super(documentName);
    }

    @Override
    protected void writeHeader() {
        System.out.println("[PDF Header] Setting up font styles, margins, and metadata.");
    }

    @Override
    protected void writeContent(String content) {
        System.out.println("[PDF Body] Drawing text to canvas: \"" + content + "\"");
    }

    @Override
    protected void writeFooter() {
        System.out.println("[PDF Footer] Adding page number: Page 1 of 1.");
    }
}
```

#### Subclass B: CSV Exporter
```java
// File: CsvExporter.java
public class CsvExporter extends DocumentExporter {

    public CsvExporter(String documentName) {
        super(documentName);
    }

    @Override
    protected void writeHeader() {
        System.out.println("[CSV Header] ID,TIMESTAMP,CONTENT_PAYLOAD");
    }

    @Override
    protected void writeContent(String content) {
        System.out.println("[CSV Body] 1,1700000000,\"" + content.replace(",", ";") + "\"");
    }

    @Override
    protected void writeFooter() {
        System.out.println("[CSV Footer] --- End of CSV ---");
    }
}
```

---

### Step 3: Run the Application (Polymorphism in Action)

```java
// File: Main.java
public class Main {
    public static void main(String[] args) {
        // DocumentExporter doc = new DocumentExporter("Test"); // COMPILE ERROR: Cannot instantiate abstract class

        // Polymorphic assignment
        DocumentExporter pdf = new PdfExporter("MonthlyReport.pdf");
        DocumentExporter csv = new CsvExporter("UserData.csv");

        // Executing the shared workflow
        pdf.export("Revenue: $45,000 | Profit: $12,000");
        csv.export("User: Alice, Role: Admin");
    }
}
```

#### Output:
```text
Starting export for: MonthlyReport.pdf
[PDF Header] Setting up font styles, margins, and metadata.
[PDF Body] Drawing text to canvas: "Revenue: $45,000 | Profit: $12,000"
[PDF Footer] Adding page number: Page 1 of 1.
Export completed successfully.

Starting export for: UserData.csv
[CSV Header] ID,TIMESTAMP,CONTENT_PAYLOAD
[CSV Body] 1,1700000000,"User: Alice; Role: Admin"
[CSV Footer] --- End of CSV ---
Export completed successfully.
```

---

## 5. Abstract Class vs Interface

| Criteria | Abstract Class | Interface |
| :--- | :--- | :--- |
| **Multiple Inheritance** | A class can extend only **one** abstract class (single inheritance). | A class can implement **multiple** interfaces. |
| **State / Fields** | Can maintain non-static, mutable instance variables. | Fields are implicitly `public static final` (constants only). |
| **Constructors** | Can declare constructors (invoked via `super()`). | Cannot have constructors. |
| **Method Implementation** | Can have abstract, concrete, `final`, and `static` methods. | Can have abstract methods, `default` methods (Java 8+), `static` methods, and `private` methods (Java 9+). |
| **Speed** | Marginally faster method dispatch than interface invocations. | Requires search through method tables (insignificant in modern JVMs). |
| **Design Intent** | **"Is-A"** relationship; represents an identity with shared base state. | **"Can-Do"** relationship; defines a contract or capability. |

---

## 6. When to Use Abstract Classes

Choose an **Abstract Class** when:
1. You want to share state (instance fields) and common implementation among closely related classes.
2. You need non-public access modifiers (`protected` or package-private) for methods and fields.
3. You intend to utilize the **Template Method Pattern**, defining the skeleton of an algorithm while deferring specific steps to subclasses.
4. You expect to add new methods in the future with default behavior without breaking existing subclass hierarchies.