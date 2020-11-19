package day18_Strings;

import java.util.Scanner;

public class SubstringMethods2 {
    public static void main(String[] args) {

        String str = "Today is Monday";
             //       0123456789
        String day = str.substring(9, str.length());
        //String day = str.substring(9); same as above because substring is created from given beginning index till the end

        System.out.println(day);
        System.out.println("==============================================");
        String firstName = "cYbErTEK"; // Cybertek

        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase(); // formats string into this format (Word)
        System.out.println(firstName);
        System.out.println("============================================================");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name");
        String first = scan.next(); // Cybertek
        first = first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase();
        System.out.println("Enter last name");
        String last = scan.next();
        last = last.substring(0, 1).toUpperCase() + last.substring(1).toLowerCase();
        String fullName = first + " " + last;
        System.out.println("Full name: " + fullName);

    }
}
