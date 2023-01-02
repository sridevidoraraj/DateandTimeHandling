package com.example.gcit;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class LocalDateMain {

    public static void main(String[] args) {

        LocalDate myObj = LocalDate.now();
        System.out.println(myObj +"\n");

        LocalTime myObj1 = LocalTime.now();
        System.out.println(myObj1 +"\n");

        ZoneId zone = ZoneId.of("Asia/Tokyo");
        LocalTime time1 = LocalTime.now(zone);
        System.out.println("Japan Time Zone: "+time1 + "\n");

        LocalDateTime myObj2 = LocalDateTime.now();
        System.out.println(myObj2 +"\n");
        LocalDateTime myObj3 = LocalDateTime.parse("2020-06-10T08:15:30");
        System.out.println(myObj3 +"\n");

        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate +"\n");

        MonthDay month = MonthDay.now();
        LocalDate date = month.atYear(1994);
        System.out.println(date);

    }
}
