public StringBuilder append(String str)

var sb = new StringBuilder().append(1).append('c');
sb.append("-­").append(true);
System.out.println(sb); // 1c-true
