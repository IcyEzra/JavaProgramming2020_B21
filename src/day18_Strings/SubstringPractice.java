package day18_Strings;

import java.util.Scanner;

public class SubstringPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String fruit = "apple";
        String fruit2 = "banana";

        fruit = fruit.substring(1, 5);
        fruit2 = fruit2.substring(2, 6);

        System.out.println(fruit.concat(fruit2));

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
