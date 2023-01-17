# Implicit Casting
 Implicit (automatically) casting (When there is no precision to be lost).
```java
// byte > short > int > long > float > double
short x = 1; // short = 2 Bytes
int y = x + 2; // int = 4 Bytes
System.out.println(y);
double x1 = 1.1; // short = 2 Bytes
double y1 = x1 + 2; // int (4B) is less precise than a double(8B) 2 gets casted to 2.0
System.out.println(y1);
```

# Explicit Casting
```java
double x = 1.1;
int y = (int)x + 2;
System.out.println(y); // 3
```

# Parsing
```java
String x = "1";
Double.parseDouble(x);
int y = Integer.parseInt(x);
System.out.println(y);
```