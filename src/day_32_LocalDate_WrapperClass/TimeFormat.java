package day_32_LocalDate_WrapperClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormat {

    public static void main(String[] args) {

        /*
        Local Date:
            year: yyyy
            month: MM (number) , MMM (three letters of month) , MMMM (full name)
            days: dd
            name of day: E(three letters) , EEEE (full name)

            Month / Day / Year

         LocalTime:
            hours: hh
            minutes:  mm
            seconds: ss
            am/pm: a

         */

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM/dd/yyyy EEEE");

        LocalDate today = LocalDate.now(); // 2020-11-23
        System.out.println(today);

        System.out.println(today.format(df)); // Month/day/year DayOfWeek

        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalTime now = LocalTime.now();

        System.out.println(now); // 17:12:31.871

        System.out.println( now.format(tf) ); // 05:12:31 PM

        // Monday 12:40 pm Nov/23/2020
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/yyyy");
        LocalDateTime dt1 = LocalDateTime.of(2020,11,23,12,40);

        System.out.println(dt1);

        System.out.println(dt1.format(dtf));

        // task:

        LocalDate tomorrow =  LocalDate.of(2020, 11, 24);
        System.out.println(tomorrow.format(df));

        boolean r1 = today.isBefore(tomorrow); // true
        boolean r2 = today.isAfter(tomorrow);  // false

        System.out.println(r1);
        System.out.println(r2);

        // calculate the age
        // 2020-11-23      2020
        int currentYear = LocalDate.now().getYear();
        LocalDate DofB = LocalDate.of(2000, 5, 19);

        int age = currentYear - DofB.getYear();

        System.out.println(age);

        System.out.println(DofB.plusDays(10));

        LocalDate rightNow = LocalDate.now();

        LocalDate holidayBreak = rightNow.plusDays(2);

        System.out.println(holidayBreak);


        LocalTime time = LocalTime.now();
        LocalTime lunchBreak = time.plusMinutes(15);

        System.out.println(lunchBreak.format(tf));

        System.out.println("===============================================");

        LocalTime classStarts = LocalTime.of(10, 0);
        LocalTime firstBreak = classStarts.plusMinutes(45);
        System.out.println(firstBreak);

        LocalTime secondBreak = firstBreak.plusHours(1);
        System.out.println(secondBreak);

        LocalTime thirdBreak = secondBreak.plusHours(1).plusMinutes(15);
        System.out.println(thirdBreak);

        LocalTime afternoonClass = thirdBreak.plusHours(1).plusMinutes(15);
        System.out.println("Come back at: "+afternoonClass.format(tf));




    }
}
