int value = 3; // Stored as 0011
int complement = ~value; // Stored as 1100
System.out.println(value); // 3
System.out.println(complement); // -4

int original = 3;
int complement = ~original;
System.out.println("Original: " + original); // 3
System.out.println("Complement: " + complement); // -4

System.out.println("Original: " + (-1 * complement - 1)); // 3
System.out.println("Complement: " + (-1 * original - 1)); // -4
