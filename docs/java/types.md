# Primite Types 

```java
// Primitive Types1
package com.deadpool;

import java.util.Date;

public final class DeadPool {
    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        // Primitive Type

        // byte 1 Bytes [-128, 127]
        // short 2 Bytes [-32K, 32K]
        // int 4 Bytes [-2B, 2B]
        // long 8 Bytes
        // float 4 Bytes
        // double 8 Bytes
        // char 2 Bytes A, B, C
        // boolean 1 true/false
        
        byte age = 69;
        long viewsCount = 123_123_123_123L;
        float price = 10.99F;
        char letter = 'A';
        boolean isApproved = true;
        byte age1 = 30;

        // ReferenceTypes
        Date now = new Date();
        System.out.println(now.getTime());
    }
}
```
        
# Reference Types
```java
// Reference Types
Point point1 = new Point(1, 1);
Point point2 = point1;

System.out.println(point1); // [x=1, y=1]
System.out.println(point2); // [x=1, y=1]
point1.x = 3;
point1.y = 3;

System.out.println(point1); // [x=3, y=3]
System.out.println(point2); // [x=3, y=3]
```

# Constants
```java
final float PI = 3.14F;
```