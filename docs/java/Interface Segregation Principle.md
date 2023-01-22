# Interface Segregation Principle
ISP splits interfaces that are very large into smaller and more specific ones so that clients will only have to know about the methods that are of interest to them.
`Resizable.java`
```java
package com.demo;

public interface Resizable {
   void resize(int size);
}
```

`Draggable.java`
```java
package com.demo;

public interface Draggable {
    void drag();
}
```
`UIWidget.java`
```java
package com.demo;

public interface UIWidget extends Draggable, Resizable {
   void render();
}
```