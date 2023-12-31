int fur = (int)5;
int hair = (short) 2;
String type = (String) "Bird";
short tail = (short)(4 + 10); // Note parenthesis
long feathers = 10(long); // DOES NOT COMPILE (Wrong side of value)

float egg = 2.0 / 9; // DOES NOT COMPILE
int tadpole = (int)5 * 2L; // DOES NOT COMPILE
short frog = 3 ­2.0; // DOES NOT COMPILE

byte hat = 1;
short boots = 2 + hat; // DOES NOT COMPILE
byte gloves = 7 * 100; // DOES NOT COMPILE
