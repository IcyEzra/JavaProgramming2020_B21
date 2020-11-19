package day16_Scanner2;

import java.util.Scanner;

public class Scanner_Next {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = input.next(); // only accepts single word, if you want multiple words then you need input.nextLine()

        System.out.println("Enter your last name");
        String lastName = input.next();

        System.out.println("Full name is: " + firstName + " " + lastName);






    }
}
