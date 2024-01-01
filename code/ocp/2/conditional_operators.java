int hour = 10;
boolean zooOpen = true || (hour < 4);
System.out.println(zooOpen); // true

if(duck != null & duck.getAge() < 5) { // Could throw a NullPointerException
// Do something
}

if(duck != null && duck.getAge()<5) {
// Do something
}

int rabbit = 6;
boolean bunny = (rabbit >= 6) || (++rabbit <= 7);
System.out.println(rabbit); // 6
