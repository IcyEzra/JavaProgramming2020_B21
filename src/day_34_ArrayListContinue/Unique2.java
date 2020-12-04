package day_34_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Unique2 {
    public static void main(String[] args) {
    // Task 1
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,1,2,3,3,4,5,5,6,6,7,8,8,9,9,10));

        //removes all duplicates and leaves uniques, if you wanted to remove the uniques and keep the duplicates just change > to ==
        numbers.removeIf(p -> Collections.frequency(numbers, p) > 1);

        System.out.println(numbers);
        System.out.println("=======================================");
    // Task 1 but with String

        String str = "aabaacdde";
        ArrayList<String> unique = new ArrayList<>();
        unique.addAll(Arrays.asList(str.split("")));

        unique.removeIf(p -> Collections.frequency(unique, p) > 1);

        // extra task parameter - assign result to String, here's how -
        String result = unique.toString().replace(", ", "").substring(1).replace("]","");

        System.out.println(result);
        System.out.println(unique);

        System.out.println("=======================================");
    // Task 2, remove all characters except for special characters

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('a','1','b','2','c','d','$','#','@','?','*'));
        // can be done this way but we also have Character.isLetterOrDigit method
        // chars.removeIf( p -> Character.isDigit(p) || Character.isLetter(p));
        chars.removeIf(p -> Character.isLetterOrDigit(p));

        System.out.println(chars);

    }
}
/*
Task:
   1) Write a program that find the unique names from an ArrayList of String
        DO NOT USE:
            for loop, for each loop, while loop, do while loop
   2) Write a program that can remove the digits and letters from an array list of characters
         DO NOT USE:
            for loop, for each loop, while loop, do while loop
 */