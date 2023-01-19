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