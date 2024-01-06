public StringBuilder delete(int startIndex, int endIndex)
public StringBuilder deleteCharAt(int index)

var sb = new StringBuilder("abcdef");
sb.delete(1, 3); // sb = adef
sb.deleteCharAt(5); // Exception

var sb = new StringBuilder("abcdef");
sb.delete(1, 100); // sb = a
