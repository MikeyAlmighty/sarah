public static ZonedDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanos, ZoneId zone)
public static ZonedDateTime of(LocalDate date, LocalTime time, ZoneId zone)
public static ZonedDateTime of(LocalDateTime dateTime, ZoneId zone)

var zone = ZoneId.of("US/Eastern");
var date1 = LocalDate.of(2022, Month.JANUARY, 20);
var time1 = LocalTime.of(6, 15); // hour and minute
var dateTime1 = LocalDateTime.of(2022, Month.JANUARY, 20, 6, 15, 30);

var zoned1 = ZonedDateTime.of(2022, 1, 20, 6, 15, 30, 200, zone);
var zoned2 = ZonedDateTime.of(date1, time1, zone);
var zoned3 = ZonedDateTime.of(dateTime1, zone);

System.out.println(ZonedDateTime.now()); // 2024-01-09T07:39:43.899106228+02:00[Africa/Johannesburg]
