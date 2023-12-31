int x = 1;
long y = 33;
var z = x * y; // z is a long

short x = 1;
short y = 33;
var z = x * y; // z is an int

short w = 14;
float x = 13.0F;
double y = 30;
var z = w * x / y; // double

short mouse = 10;
short hamster = 3;
short capybara = mouse * hamster;// DOES NOT COMPILE

short mouse = 10;
short hamster = 3;
short capybara = (short)(mouse * hamster);
