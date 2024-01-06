StringBuilder sb1 = new StringBuilder(); // empty sequence of characters
StringBuilder sb2 = new StringBuilder("animal"); // animal
StringBuilder sb3 = new StringBuilder(10); // Initial capacity

StringBuilder alpha = new StringBuilder();
for (char current = 'a'; current <= 'z'; current++) {
    alpha.append(current);
}
System.out.println(alpha); // abcdefghijklmnopqrstuvwxyz

StringBuilder sb = new StringBuilder("start"); // sb = start

sb.append("+middle"); // sb = start+middle

StringBuilder same = sb.append("+end"); // sb = start+middle+end

StringBuilder a = new StringBuilder("abc");
StringBuilder b = a.append("de");
b = b.append("f").append("g");
System.out.println("a = " + a); // abcdefg
System.out.println("b = " + b); // abcdefg
