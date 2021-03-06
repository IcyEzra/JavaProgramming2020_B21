package day_25_ArrayIntro;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       while(true){
        System.out.println("Enter your first number");
        double n1 = scan.nextDouble();

        System.out.println("Enter operator");
        char o = scan.next().charAt(0);

        System.out.println("Enter your second number");
        double n2 = scan.nextDouble();

        switch (o) {
            case '+':
                System.out.println("Addition " + (n1 + n2));
                break;
            case '-':
                System.out.println("Subtraction " + (n1 - n2));
                break;
            case '*':
                System.out.println("Multiplication " + (n1 * n2));
                break;
            case '/':
                System.out.println("Division " + (n1 / n2));
                break;
            default:
                System.out.println("Invalid type");
            }
            System.out.println("Would you like to continue?");
            String a = scan.next().toLowerCase();

            while( !(a.equals("yes") || a.equals("no")) ){ // while the answer is not valid, this is also a nested while loop
                System.out.println("Invalid answer, please re enter");
                System.out.println("Would you like to continue");
                a = scan.next().toLowerCase();
            }

            if(a.equals("no")) {
                break;
            }

       }


    }
}
