# Dependency Injection

Our classes should not instantiate their dependencies.

## Constructor Injection
> For mandatory dependencies (or aiming for immutability).

- Ensures that dependency is present (Will fail without)
- Can create immutable classes
**issues**: Possible to run into Circular dependency issues
```java
// Main.java
public static void main(String[] args) {
    var calculator = new TaxCalculator2018(10_000);
    // Poor mans dependency injection
    var report = new TaxReport(calculator); // Constructor Injection
}

// TaxReport.java
public class TaxReport {
    private TaxCalculator calculator;

    public TaxReport(TaxCalculator calculator) {
        this.calculator = calculator;
    }
}
```

## Setter Injection
> For optional or changeable dependencies.

Change dependencies of class throughout lifetime of application.
```java
public static void main(String[] args) {
    var calculator2 = new TaxCalculator2018(9_000);
    report.setCalculator(calculator2); // Setter Injection

    report.show();
}
```

## Method Injection
```java
public static void main(String[] args) {
    var report = new TaxReport(new TaxCalculator2018(9_000));
    report.show(calculator3); // Method injection
}
```