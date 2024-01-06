var one = new StringBuilder();
var two = new StringBuilder();
var three = one.append("a");
System.out.println(one == two); // false
System.out.println(one == three); // true

var x = "Hello World";
var z = " Hello World".trim();
System.out.println(x.equals(z)); // true

var name = "a"; // String
var builder = new StringBuilder("a"); // StringBuilder
System.out.println(name == builder); // DOES NOT COMPILE
