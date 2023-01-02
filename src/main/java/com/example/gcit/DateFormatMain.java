package com.example.gcit;

import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateFormatMain {
    public static void main(String[] args) throws ParseException {
        Date currentDate = new Date();
        System.out.println("Current Date : "+currentDate+"\n");
        String dateToStr = DateFormat.getInstance().format(currentDate);
        System.out.println("Date Format using getInstance() : "+dateToStr+"\n");

        String pattern = "dd.MM.yyyy";
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(pattern);
        System.out.println(dateFormatter.format(LocalDate.of(2016, 7, 31)));

        String pattern1 = "HH:mm:ss";
        DateTimeFormatter timeColonFormatter = DateTimeFormatter.ofPattern(pattern1);
        LocalTime time = LocalTime.of(17, 35, 50);
        System.out.println(timeColonFormatter.format(time));

    }
}
