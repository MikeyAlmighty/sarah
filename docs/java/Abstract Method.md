# Abstract Method

Can't be created, can only be extended

```java
package com.demo;

abstract class SuperHero {
    public abstract void power();
}

// Throws Error as we need to implement a power() method
class DeadPool extends SuperHero {
    // public void power(){
    //     System.out.println("Eat chimichangas!");
    // }
}

class AquaMan extends SuperHero {
    public void power(){
        System.out.println("Dolphin call!");
    }
}

public class Main {
    public static void main(String[] args) {

    }
}
```