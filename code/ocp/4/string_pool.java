var x = "Hello World";
var y = "Hello World";
System.out.println(x == y); // true

var x = "Hello World";
var z = " Hello World".trim();
System.out.println(x == z); // false

var singleString = "hello world";
var concat = "hello ";
concat += "world";
System.out.println(singleString == concat); // false

var x = "Hello World";
var y = new String("Hello World"); // explicitly telling the JVM to create a new Object in memory
System.out.println(x == y); // false
