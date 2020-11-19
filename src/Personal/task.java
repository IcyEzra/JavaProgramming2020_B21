package Personal;

import java.util.Scanner;

public class task {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first name");
        String firstName = scan.next();
        System.out.println("Enter last name");
        String lastName = scan.next();
      // commented out for clarity, above code is same part of task but asks for user input
      //  String firstName = "cybertek";
      //  String lastName = "school";
        String initials = firstName.substring(0,1).toUpperCase() + "." + lastName.substring(0,1).toUpperCase();
        System.out.println(initials);
        scan.close();


        System.out.println("============================================================");

        String word = "racecar";
        String one = word.substring(0,1); // I used these 2 lines of code to check if it was checking the right object, this string is for the first r
        String two = word.substring(6,7); // this string is the last r in the string
        System.out.println(one);
        System.out.println(two);

        boolean isValid = word.substring(0,1).equals(word.substring(6,7));
        System.out.println(isValid);



    }
}
/*
task 1
write a program that can return the initials of the user
ex)
    cybertek
    school
output:
    C.S
Task 2
Write a program that can check if the first and last characters of the string are the same
ex)
       level
   Output:
       same
ex2)
      java
   Output:
      not same
 */