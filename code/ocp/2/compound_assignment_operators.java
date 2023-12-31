int camel = 2, giraffe = 3;
camel = camel * giraffe; // Simple assignment operator
camel *= giraffe; // Compound assignment operator

long goat = 10;
int sheep = 5;
sheep = sheep * goat; // DOES NOT COMPILE

long goat = 10;
int sheep = 5;
sheep *= goat; // Explicit cast to (int)
