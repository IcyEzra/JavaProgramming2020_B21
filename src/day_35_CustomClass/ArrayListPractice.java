package day_35_CustomClass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class ArrayListPractice {
    public static void main(String[] args) {
    // Task 1
        String[] countryNames = {"Andorra","United Arab Emirates","Afghanistan","Turkey","United States"," Antigua and Barbuda","Albania", "Colombia", "Venezuela", "Panama","United Kingdom", "Mexico ", "United States"};

        ArrayList<String> countries = new ArrayList<>(Arrays.asList(countryNames));

        System.out.println(countries);

        // if condition for removeAll is used more than once, you can create a Predicate variable in order to reuse it.
        // since this exercise used the condition once, theres no need to declare or use it
        Predicate<String> length10 = p -> p.length() >= 10;

        countries.removeIf(p -> p.length() >= 10);

        System.out.println(countries);

        System.out.println("=============================");
        // Task 2

        LocalDate[] arr1 = { LocalDate.of(2010, 11, 23),
                             LocalDate.of(2012, 11, 23),
                             LocalDate.of(2013, 11, 23),
                             LocalDate.of(2014, 11, 23),
                             LocalDate.of(2015, 11, 23),
                             LocalDate.of(2016, 7, 23),
                             LocalDate.of(2017, 11, 23),
                             LocalDate.of(2018, 11, 23),
                             LocalDate.of(2019, 11, 23),
                             LocalDate.of(2020, 11, 23),};

        // declaring variable for date so the rest of the data can be checked against it
        LocalDate d1 = LocalDate.of(2016,8,15);
        ArrayList<LocalDate> dates = new ArrayList<>(Arrays.asList(arr1));

        dates.removeIf(p -> p.isBefore(d1)); // removes all dates before d1

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM-dd-yyyy");

        System.out.println(dates); // prints dates ArrayList after adding all elements from arr1 and removals

        for(LocalDate each : dates){
            System.out.println(each.format(df));
        }



    }
}
/*
Warmup tasks:
    task01: 1. create an Array of string called country names
            2. write a program that can remove all the country names that have length of 10 or greater

    task02: 1. create an Array of LocalDate
            2. write a program that can remove all the dates before August-15-2016


 */