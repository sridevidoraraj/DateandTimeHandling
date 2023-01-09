## Date And Time Handling

### Structure

This project structured using intellij platform and maven as build system.

### About Project

-> Java 8 introduced new APIs for Date and Time to address the shortcomings of the older java.util.Date and java.util.Calendar.

-> core classes of the new Java 8 project that are part of the java.time package, such as LocalDate, LocalTime, LocalDateTime, ZonedDateTime, Period, Duration and their supported APIs.

-> The most commonly used classes are LocalDate, LocalTime and LocalDateTime.

-> The LocalDate represents a date in ISO format (yyyy-MM-dd) without time.

LocalDate localDate = LocalDate.now();

-> The LocalTime represents time without a date.

-> Similar to LocalDate, we can create an instance of LocalTime from the system clock or by using parse and of methods.

LocalTime now = LocalTime.now();

-> LocalDateTime is used to represent a combination of date and time. This is the most commonly used class when we need a combination of date and time.

LocalDateTime.now();

-> Java 8 provides ZonedDateTime when we need to deal with time-zone-specific date and time. The ZoneId is an identifier used to represent different zones. 

ZoneId zoneId = ZoneId.of("Europe/Paris");

#### Reference Link

[Link](https://www.baeldung.com/java-8-date-time-intro)
