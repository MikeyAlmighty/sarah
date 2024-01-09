import java.time.*; // import time classes

var d = new LocalDate(); // DOES NOT COMPILE

var d = LocalDate.of(2022, Month.JANUARY, 32) // DateTimeException
