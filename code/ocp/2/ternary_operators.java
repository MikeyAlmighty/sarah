// booleanExpression ? expression1 : expression2
int owl = 5;
int food = owl < 2 ? 3 : 4;
System.out.println(food); // 4

int stripes = 7;
System.out.print((stripes > 5) ? 21 : "Zebra");
int animal = (stripes < 9) ? 3 : "Horse"; // DOES NOT COMPILE

int sheep = 1;
int zzz = 1;
int sleep = zzz < 10 ? sheep++ : zzz++;
System.out.print(sheep + "," + zzz); // 2,1

int sheep = 1;
int zzz = 1;
int sleep = sheep >= 10 ? sheep++ : zzz++;
System.out.print(sheep + "," + zzz); // 1,2
