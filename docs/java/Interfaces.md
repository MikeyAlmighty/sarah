# Interfaces

We use interface to build `loosely-coupled`, `extensible`, testable applications.

Interfaces are the reference types which are similar to classes but contains only abstract methods

- Interface is implemented by a class
- Interface can extend multiple interfaces
- Interface does not contain constructors or instance fields
- Interface **cannot** be instantiated

## Example
Note: add `@Override` annotation for interface methods.
```java
interface Animal {
    void makeSound();
    void run();
}

class Pig implements Animal {
    @Override
    public void run(){
        //...
    }

    @Override
    public void makeSound(){
        System.out.println("Oink!");
    }
}
```