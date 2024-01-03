public int length()

var name = "animals";
System.out.println(name.length()); // 7

public char charAt(int index)

var name = "animals";

System.out.println(name.charAt(0)); // a
System.out.println(name.charAt(6)); // s
System.out.println(name.charAt(7)); // java.lang.StringIndexOutOfBoundsException: String index out of range: 7

public int indexOf(int ch)
public int indexOf(int ch, int fromIndex)
public int indexOf(String str)
public int indexOf(String str, int fromIndex)

var name = "animals";

System.out.println(name.indexOf('a')); // 0
System.out.println(name.indexOf("al")); // 4
System.out.println(name.indexOf('a', 4)); // 4 (Don't even look at 'a' until the 4th index)
System.out.println(name.indexOf("al", 5)); // -1 (Doesn't find anything)

public String substring(int beginIndex)
public String substring(int beginIndex, int endIndex)

var name = "animals";

System.out.println(name.substring(3)); // mals
System.out.println(name.substring(name.indexOf('m'))); // mals
System.out.println(name.substring(3, 4)); // m
System.out.println(name.substring(3, 7)); // mals
