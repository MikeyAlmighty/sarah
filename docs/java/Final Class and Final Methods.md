# Final Classes and Methods

## Final Class

Can **NOT** extend a final class
```java
final class SuperHero {
    public void power(){
    }
}

// Throws an error
class DeadPool extends SuperHero {
}
```

## Final Methods

Can **NOT** override final methods

```java
class SuperHero {
    final public void power(){
        System.out.println("Superhero class");
    }
}

class DeadPool extends SuperHero {
    // Throws an error
    @Override
    public void power(){ 
        System.out.println("DeadPool class");
    }
}
```