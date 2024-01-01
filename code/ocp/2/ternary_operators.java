// booleanExpression ? expression1 : expression2
int owl = 5;
int food = owl < 2 ? 3 : 4;
System.out.println(food); // 4

int stripes = 7;
System.out.print((stripes > 5) ? 21 : "Zebra");
int animal = (stripes < 9) ? 3 : "Horse"; // DOES NOT COMPILE
