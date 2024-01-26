public enum Season {
    Winter,
    SPRING,
    SUMMER,
    FALL; // Optional for Simple Enums
}

var s = Season.SUMMER;

System.out.println(Season.SUMMER); // SUMMER
System.out.println(s == Season.SUMMER); // true

for(var season: Season.values()) {
    System.out.println(season.name() + " " + season.ordinal());
}
/*
 * OUTPUT:
 * WINTER 0
 * SPRING 1
 * SUMMER 2
 * FALL 3
*/

Season s = Season.valueOf("SUMMER"); // SUMMER
Season t = Season.valueOf("summer"); // IllegalArgumentException

Exception in thread "main" java.lang.IllegalArgumentException:
No enum constant enums.Season.summer
