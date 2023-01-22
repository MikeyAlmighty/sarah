# Object.hashCode and Equals

address of object goes through a hash function which returns the hashCode (integer) of that object.
(hash maps an Object's `address` to an `integer`)

See below example:
Returns **true** as both `box1` and `box2` are referencing the same address in memory.
```java
// Where TextBox is some arbitrary Class
var box1 = new TextBox();
var box2 = box1;
System.out.println(box1.hashCode()); // 112810359
System.out.println(box2.hashCode()); // 112810359
System.out.println(box1.equals(box2)); // true
```

Whereas below example, `box1` and `box2` reference **different** memory addresses.

```java
// Where TextBox is some arbitrary Class
var box1 = new TextBox();
var box2 = new TextBox();
System.out.println(box1.hashCode()); // 112810359
System.out.println(box2.hashCode()); // 243083622
System.out.println(box1.equals(box2)); // false
```

`Object.toString()` returns the string representation of object (full qualifier name of class (including package), #, then hashCode in Hex)

i.e. `com.demo.TextBox@6b95977`
```java
System.out.println(box1.hashCode()); // 112810359
System.out.println(box1.toString()); // com.demo.TextBox@6b95977
int parsedHash = Integer.parseInt("6b95977", 16);
System.out.println(parsedHash); // 112810359
```

## Comparing instances
### Point.java
```java
package com.demo;

public class Point {
    private int X;
    private int Y;

    public Point(int x, int y) {
        X = x;
        Y = y;
    }

    public int getX() {
        return X;
    }
    public void setX(int x) {
        X = x;
    }
    public int getY() {
        return Y;
    }
    public void setY(int y) {
        Y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true; // Check reference equality
        if (!(obj instanceof Point))
          return false;
        var other = (Point)obj;
        return other.X == X && other.Y == Y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(X, Y);
    }
}
```
## Main.java
```java
package com.demo;

public class Main {
    public static void main(String[] args) {
        var point1 = new Point(1, 2);
        var point2 = new Point(1, 2);
        System.out.println(point1.equals(point2));
    }
}
```
