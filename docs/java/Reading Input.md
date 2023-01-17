# Scanner
```java
Scanner scanner = new Scanner(System.in);
System.out.print("Name?: ");
String name = scanner.nextLine().trim();
scanner.close();
System.out.println("Your name is" + name + "!");
```