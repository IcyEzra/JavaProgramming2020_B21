package day_32_LocalDate_WrapperClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Time {

    public static void main(String[] args) {

        LocalTime t1 = LocalTime.of(11,45); // the ranges of the hour min, sec, and nanosec are fixed ranges, meaning hours can't go above 24, min cannot go above 60

        System.out.println("t1 = " + t1);

        LocalTime now = LocalTime.now(); // gives current time up to the nanosecond

        System.out.println(now);

        System.out.println("===================================================================");

        LocalDateTime t2 = LocalDateTime.of(2020,11,23,11,50); // no need ofr adding second or nanoseconds

        System.out.println(t2);

        LocalDateTime t3 = LocalDateTime.now();

        System.out.println(t3);

    }
}
