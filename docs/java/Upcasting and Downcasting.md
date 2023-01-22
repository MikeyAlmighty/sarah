# Upcasting and Downcasting

```java
package com.demo;

public class Main {
    public static void main(String[] args) {
        // NB: TextBox extends UIControl
        var box1 = new TextBox();
        show(box1); // Get's "upcasted" to a UIControl (As all textboxes are UIControls)
    }

    public static void show(UIControl control) {
        var textBox = (TextBox) control; // Downcasted back to textBox
    }
}
```

## ClassCast Exception

`ClassCast` Exception is thrown when trying to cast "down" to an incorrect instance:

All TextBox instances are UIControls but **NOT** all UIControl instances are TextBoxes.

```java
package com.demo;

public class Main {
    public static void main(String[] args) {
        var control = new UIControl();
        show(control); // Get's "upcasted" to a UIControl (As all textboxes are UIControls)
    }

    public static void show(UIControl control) {
        // var textBox = (TextBox) control; // ClassCast Exception, need to check if Control here is an instance of TextBox
        if (control instanceof TextBox) {

        }
    }
}

```