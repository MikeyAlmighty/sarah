public static LocalDate of(int year, Month month, int dayOfMonth)
public static LocalDate of(int year, int month, int dayOfMonth)

var date1 = LocalDate.of(2022, Month.JANUARY, 20);
// OR
var date2 = LocalDate.of(2022, 1, 20);

System.out.println(LocalDate.now()); // 2024-01-09
