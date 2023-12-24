Object obj = "Upcast Me"; // Widening - Implicit

String casted = (String) obj; // Narrowing - requires cast

Integer iRef = 10;  // (1) Implicit boxing: Integer <----- int
Double dRef = Double.valueOf(3.14); // (2) Explicit boxing: Double <----- double
int i = iRef; // (3) Implicit unboxing: int <----- Integer
double d = dRef.doubleValue(); // (4) Explicit unboxing: double <----- Double
