package com.example.gcit;

import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;

public class ZoneMain {
    public static void main(String... args) {
        ZoneId zone1 = ZoneId.of("Asia/Kolkata");
        ZoneId zone2 = ZoneId.of("Asia/Tokyo");
        LocalTime id1 = LocalTime.now(zone1);
        LocalTime id2 = LocalTime.now(zone2);
        System.out.println(id1);
        System.out.println(id2);
        System.out.println(id1.isBefore(id2)+"\n");

        ZoneId zone = ZoneId.systemDefault();
        System.out.println(zone+"\n");

        ZoneId z = ZoneId.systemDefault();
        String s = z.getId();
        System.out.println(s+"\n");
        System.out.println(z.getDisplayName(TextStyle.FULL, Locale.ROOT));

        ZoneOffset zone3 = ZoneOffset.ofHours(5);
        System.out.println(zone3+"\n");

        LocalDateTime ldt = LocalDateTime.of(2023, Month.JANUARY,  2,   15,   26);
        ZoneId  india = ZoneId.of("Asia/Kolkata");
        ZonedDateTime zone4  = ZonedDateTime.of(ldt, india);
        System.out.println("In India Central Time Zone : " + zone4+"\n");

        OffsetDateTime offset = OffsetDateTime.now();
        System.out.println(offset.getDayOfMonth());
        System.out.println(offset.getDayOfYear());
        System.out.println(offset.getDayOfWeek()+"\n");

        OffsetTime offset1 = OffsetTime.now();
        int h = offset1.getHour();
        System.out.println(h+ " hour");

    }


}
