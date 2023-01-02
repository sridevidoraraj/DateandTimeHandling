package com.example.gcit;

import java.time.Duration;
import java.time.Instant;

public class InstantMain {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant +"\n");

        Instant instant1 = Instant.parse("2017-02-03T11:25:30.00Z");
        instant1 = instant1.minus(Duration.ofDays(125));
        System.out.println(instant1 +"\n");

        long epochSecond = 1200000l;
        Instant result = Instant.ofEpochSecond(epochSecond);
        System.out.println("Instant: " + result);
    }
}
