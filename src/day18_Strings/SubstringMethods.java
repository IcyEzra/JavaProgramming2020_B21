package day18_Strings;

import java.util.*;

public class SubstringMethods {
    public static void main(String[] args) {

        String str = "Today is Monday";
                //    0123456789
        String day = str.substring(9, 15);

        System.out.println(day); // prints monday


        String email = "cybertek@gmail.com";
                   //   0123456789
        String domain = email.substring(9, 14);
        System.out.println(domain); // prints gmail

        //write a program where user enters first then last name then console prints out First Last format

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first name");
        String firstName = input.next();
        System.out.println("Enter last name");
        String lastName = input.next();
        String firstChar = firstName.substring(0, 1).toUpperCase();
        String rest = firstName.substring(1, firstName.length()).toLowerCase();
        String firstChar2 = lastName.substring(0, 1).toUpperCase();
        String rest2 = lastName.substring(1, lastName.length()).toLowerCase();

        System.out.println(firstChar + rest + " " + firstChar2 + rest2);

    }
}
