package day_32_LocalDate_WrapperClass;

import java.time.LocalDate;

public class Date {

    public static void main(String[] args) {

        LocalDate yesterday = LocalDate.of(2020,11,22);

        System.out.println(yesterday);

       // LocalDate d1 = LocalDate.of(2020,2,30); // invalid argument because Feb 30 doesn't exist

       // System.out.println(d1);

        System.out.println( yesterday.isLeapYear() ); // returns boolean if its a leap year

        LocalDate today = LocalDate.now(); // used to find current date

        System.out.println(today);

        LocalDate DofB = LocalDate.of(1994,12,13);

        System.out.println( DofB.isLeapYear() ); // checks if my bday is in a leap year


        // LocalDate DofB

        String[] names={"Julia","inna","Anna","Ruslan","Livio"};
        LocalDate[] birthdays = {
                LocalDate.of(1990,11,23),
                LocalDate.of(1995,02,10),
                LocalDate.of(2000,03,15),
                LocalDate.of(2005, 04,20),
                LocalDate.of(2010, 05,25)
        };


        for( int i = 0; i <= names.length-1; i++){
            System.out.println( names[i] + "' birthday is: "+ birthdays[i]);
            System.out.println(names[i] +" was born on leap year: " +  birthdays[i].isLeapYear()+"\n" );

        }


    }
}
