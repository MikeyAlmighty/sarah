public StringBuilder insert(int offset, String str)

var sb = new StringBuilder("animals");
sb.insert(7, "-"); // sb = animals-
sb.insert(0, "-"); // sb = -animals-
sb.insert(4, "-"); // sb = ­ani-mals-
System.out.println(sb);
