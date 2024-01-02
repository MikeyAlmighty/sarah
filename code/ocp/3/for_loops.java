/*
    for (initialization; booleanExpression; updateStatement) {
        // Body
    }
*/

for (int i = 0; i < 5; i ++) {
    System.out.println(i);
}

for (var counter = 4; counter >= 0; counter-­) {
    System.out.print(counter + " ");
} // 4 3 2 1 0

for( ; ; )
    System.out.println("Hello World");

int x = 0;
for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
    System.out.print(y + " "); }
System.out.print(x + " ");

int x = 0;
for(int x = 4; x < 5; x++) // DOES NOT COMPILE
    System.out.print(x + " ");

int x = 0;
for(x = 0; x < 5; x++)
    System.out.print(x + " ");

int x = 0;
for(long y = 0, int z = 4; x < 5; x++) // DOES NOT COMPILE
    System.out.print(y + " ");

for(long y = 0, x = 4; x < 5 && y < 10; x++, y++)
    System.out.print(y + " ");
System.out.print(x); // DOES NOT COMPILE
