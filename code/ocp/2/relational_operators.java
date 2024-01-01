int gibbonNumFeet = 2, wolfNumFeet = 4, ostrichNumFeet = 2;
System.out.println(gibbonNumFeet < wolfNumFeet); // true
System.out.println(gibbonNumFeet <= wolfNumFeet); // true
System.out.println(gibbonNumFeet >= ostrichNumFeet); // true
System.out.println(gibbonNumFeet > ostrichNumFeet); // false

public void openZoo(Number time) {
    if (time instanceof Integer)
        System.out.print((Integer)time + " O'clock");
    else if (time instanceof Short)
        System.out.print((Short)time + " O'clock");
    else
        System.out.print(time);
}

public void openZoo(Number time) {
  if(time instanceof String) // DOES NOT COMPILE
    System.out.print(time);
}

System.out.print(null instanceof Object); // false

Object noObjectHere = null;
System.out.print(noObjectHere instanceof String); // false

System.out.print(null instanceof null); // DOES NOT COMPILE
