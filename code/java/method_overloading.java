void methodA(int a, double b) { /* ... */ } // (1)
int methodA(int a) { return a; } // (2)
int methodA() { return 1; } // (3)
long methodA(double a, int b) { return b; } // (4)
long methodA(int x, double y) { return x; } // (5) Not OK as 1 is a duplicate in parameterList.

int halfIt(int a) { return a/2; } // (6)
double halfIt(int a) { return a/2.0; } // (7) Not OK

// Example
public static double min(double a, double b)
public static float min(float a, float b)
public static int min(int a, int b)
public static long min(long a, long b)

int halfIt(int a) { return a/2; } // (1)
double halfIt(int a) { return a/2.0; } // (2) Not OK
