public static String format(String format, Object args...)
public static String format(Locale loc, String format, Object args...)
public String formatted(Object args...)

var name = "Kate";
var orderId = 5;
// All print: Hello Kate, order 5 is ready
System.out.println("Hello " + name + ", order " + orderId + " is ready");
System.out.println(String.format("Hello %s, order %d is ready", name, orderId));
System.out.println("Hello %s, order %d is ready".formatted(name, orderId));

var name = "James";
var score = 90.25;
var total = 100;
System.out.println("%s:%n   Score: %f out of %d".formatted(name, score, total));
/* OUTPUT: */
// James:
//   Score: 90.250000 out of 100

var str = "Food: %d tons".formatted(2.0); // IllegalFormatConversionException

var pi = 3.14159265359;

System.out.format("[%f]",pi);// [3.141593]
System.out.format("[%12.8f]",pi);// [  3.14159265]
System.out.format("[%012f]",pi);// [00003.141593]
System.out.format("[%12.2f]",pi);// [        3.14]
System.out.format("[%.3f]",pi);// [3.142]
