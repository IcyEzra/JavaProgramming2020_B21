package day16_Scanner2;

import java.util.*;

public class Scanner_NextLine2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();

        System.out.println("Enter your phone number");
        long phoneNumber = input.nextLong();

        input.nextLine();  // the purpose of this is to accept the enter key

        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);


    }
}
