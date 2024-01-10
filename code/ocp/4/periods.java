public static void main(String[] args) {
    var start = LocalDate.of(2022, Month.JANUARY, 1);
    var end = LocalDate.of(2022, Month.MARCH, 30);
    performAnimalEnrichment(start, end);
}
private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
    var upTo = start;
    while (upTo.isBefore(end)) { // check if still before end
        System.out.println("give new toy: " + upTo);
        upTo = upTo.plusMonths(1); // add a month
    }
}

public static void main(String[] args) {
    var start = LocalDate.of(2022, Month.JANUARY, 1);
    var end = LocalDate.of(2022, Month.MARCH, 30);
    var monthly = Period.ofMonths(1); // create a period
    performAnimalEnrichment(start, end, monthly);
}

private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period) { // uses the generic period
    var upTo = start;
    while (upTo.isBefore(end)) {
        System.out.println("give new toy: " + upTo);
        upTo = upTo.plus(period); // adds the period
    }
}

var annually = Period.ofYears(1);  // every 1 year
var quarterly = Period.ofMonths(3); // every 3 months
var everyThreeWeeks = Period.ofWeeks(3); // every 3 weeks
var everyOtherDay = Period.ofDays(2); // every 2 days
var everyYearAndAWeek = Period.of(1, 0, 7); // every year and 7 days

var wrong = Period.ofYears(1).ofWeeks(1); // every week (Instead of everyYearAndWeek)

var wrong = Period.ofYears(1);
wrong = Period.ofWeeks(1);

System.out.println(Period.of(1,2,3)); // P1Y2M3D
System.out.println(Period.ofMonths(3)); // P3M

var date = LocalDate.of(2022, 1, 20);
var dateTime = LocalDateTime.of(date, time);
var period = Period.ofMonths(1);

System.out.println(date.plus(period)); // 2022–02–20
System.out.println(dateTime.plus(period)); // 2022–02–20T06:15

var time = LocalTime.of(6, 15);
var period = Period.ofMonths(1);

System.out.println(time.plus(period)); // Exception
