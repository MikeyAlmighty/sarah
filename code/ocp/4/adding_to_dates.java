var date = LocalDate.of(2022, Month.JANUARY, 20);

System.out.println(date); // 2022–01–20

date = date.plusDays(2);
System.out.println(date); // 2022–01–22

date = date.plusWeeks(1);
System.out.println(date); // 2022–01–29

date = date.plusMonths(1);
System.out.println(date); // 2022–02–28

date = date.plusYears(5);
System.out.println(date); // 2027–02–28

var date = LocalDate.of(2024, Month.JANUARY, 20);
date = date.plusMinutes(1); // DOES NOT COMPILE
