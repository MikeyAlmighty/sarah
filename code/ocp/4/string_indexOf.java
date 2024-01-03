public int indexOf(int ch)
public int indexOf(int ch, int fromIndex)
public int indexOf(String str)
public int indexOf(String str, int fromIndex)

var name = "animals";

System.out.println(name.indexOf('a')); // 0
System.out.println(name.indexOf("al")); // 4
System.out.println(name.indexOf('a', 4)); // 4 (Don't even look at 'a' until the 4th index)
System.out.println(name.indexOf("al", 5)); // -1 (Doesn't find anything)
