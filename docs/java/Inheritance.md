# Inheritance

Base Class/ Super Class/Parent Class
^
Sub class/ Child Class

use `extends` keyword to inherit a Class.

Note: All classes `extend/inherit` the **Object** Class

## Example

```java
// UIControl (Parent)
package com.demo;

public class UIControl {
    private boolean isEnabled = true;
    
    public void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
```

```java
// TextBox (Child)
package com.demo;

public class TextBox extends UIControl {
   private String text = "";

   public void setText(String text) {
    this.text = text;
   }
   public void clear() {
    text = "";
   }
}
```

## Constructors and Inheritance

Use `super()` to call Base class constructor
```java
// Child / Sub Class
public class TextBox extends UIControl {
   public TextBox() {
      super(true); // Call to Base (Parent) constructor
      System.out.println("TextBox");
   }
}
```

```java
// Parent / Base Class
public class UIControl {
    private boolean isEnabled = true;
    public UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
       System.out.println("UIControl");
    }
}
```

Note: Do **NOT** create deep inheritance hierarchies!

## Multiple inheritance
Multiple inheritance is not supported in Java.
(All classes extend the Object class, so we'd run into the diamond problem).