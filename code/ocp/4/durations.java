var daily = Duration.ofDays(1); // PT24H
var hourly = Duration.ofHours(1); // PT1H
var everyMinute = Duration.ofMinutes(1); // PT1M
var everyTenSeconds = Duration.ofSeconds(10); // PT10S
var everyMilli = Duration.ofMillis(1); // PT0.001S
var everyNano = Duration.ofNanos(1); // PT0.000000001S

var daily = Duration.of(1, ChronoUnit.DAYS);
var hourly = Duration.of(1, ChronoUnit.HOURS);
var everyMinute = Duration.of(1, ChronoUnit.MINUTES);
var everyTenSeconds = Duration.of(10, ChronoUnit.SECONDS);
var everyMilli = Duration.of(1, ChronoUnit.MILLIS);
var everyNano = Duration.of(1, ChronoUnit.NANOS);

var date = LocalDate.of(2022, 1, 20);
var time = LocalTime.of(6, 15);
var dateTime = LocalDateTime.of(date, time);

var duration = Duration.ofHours(6);

System.out.println(dateTime.plus(duration)); // 2022–01–20T12:15
System.out.println(time.plus(duration)); // 12:15
System.out.println(date.plus(duration)); // UnsupportedTemporalTypeException

var date = LocalDate.of(2022, 1, 20);
var time = LocalTime.of(6, 15);
var dateTime = LocalDateTime.of(date, time);

var duration = Duration.ofHours(23);
System.out.println(dateTime.plus(duration)); // 2022–01–21T05:15
System.out.println(time.plus(duration)); // 05:15
System.out.println(date.plus(duration)); // UnsupportedTemporalTypeException
