public boolean startsWith(String prefix)

System.out.println("abc".startsWith("a")); // true
System.out.println("abc".startsWith("A")); // false

public boolean endsWith(String suffix)

System.out.println("abc".endsWith("c")); // true
System.out.println("abc".endsWith("a")); // false

public boolean contains(CharSequence charSeq)

System.out.println("abc".contains("b")); // true
System.out.println("abc".contains("B")); // false
