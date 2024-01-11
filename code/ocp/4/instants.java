var now = Instant.now();
// do something time consuming
var later = Instant.now();
var duration = Duration.between(now, later);
System.out.println(duration.toMillis()); // Returns number milliseconds

var date = LocalDate.of(2022, 5, 25);
var time = LocalTime.of(11, 55, 00);
var zone = ZoneId.of("US/Eastern");
var zonedDateTime = ZonedDateTime.of(date, time, zone);

var instant = zonedDateTime.toInstant(); // 2022–05–25T15:55:00Z

System.out.println(zonedDateTime); // 2022–05–25T11:55–04:00[US/Eastern]
System.out.println(instant); // 202–05–25T15:55:00Z
