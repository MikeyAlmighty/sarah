# Memory Allocation

## Heap
Objects

## Stack
Primitives and short-lived variables
+ references (Address) to objects (which exist on the Heap).

```java
var textBox1 = new TextBox();
textBox1.setText("DeadPool");
System.out.println(textBox1.text); // Deadpool

var textBox2 = textBox1; // both textBox1 and textBox2 reference same address
textBox1.setText("Batman");
System.out.println(textBox2.text); // Batman
```