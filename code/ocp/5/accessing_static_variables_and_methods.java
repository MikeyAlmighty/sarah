public class Snake {
    public static long hiss = 2;
}
System.out.println(Snake.hiss); // 2

Snake s = new Snake();
System.out.println(s.hiss); // s is a Snake
s = null;
System.out.println(s.hiss); // s is still a Snake
