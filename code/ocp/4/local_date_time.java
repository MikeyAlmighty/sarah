public static LocalDateTime of(int year, int month,int dayOfMonth, int hour, int minute)
public static LocalDateTime of(int year, int month,int dayOfMonth, int hour, int minute, int second)
public static LocalDateTime of(int year, int month,int dayOfMonth, int hour, int minute, int second, int nanos)

// Others take a Month reference:
public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute)
public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute, int second)
public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute, int second, int nanos)

// Finally, one takes an existing LocalDate and LocalTime:
public static LocalDateTime of(LocalDate date, LocalTime time)

var dateTime1 = LocalDateTime.of(2022, Month.JANUARY, 20, 6, 15, 30);
// or
var time1 = LocalTime.of(6, 15);
var date1 = LocalDate.of(2022, Month.JANUARY, 20);

var dateTime2 = LocalDateTime.of(date1, time1);
System.out.println(LocalDateTime.now()); // 2024-01-09T07:37:49.372989892
