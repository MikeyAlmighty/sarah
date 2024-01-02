if(hourOfDay < 11) {
    System.out.println("Good Morning");
} else if(hourOfDay < 15) {
    System.out.println("Good Afternoon");
} else {
    System.out.println("Good Evening");
}

int hourOfDay = 1;
if(hourOfDay) { // DOES NOT COMPILE
...
}

if(hourOfDay < 11)
    System.out.println("Good Morning");
    morningGreetingCount++;
