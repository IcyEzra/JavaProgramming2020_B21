package day16_Scanner2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number one");
        double numberOne = input.nextDouble(); // accepting the first number

        System.out.println("Enter number two");
        double numberTwo = input.nextDouble(); // accepting the second number

        System.out.println("Enter the operator");
        String operator = input.next(); // accepting the operator

        input.close(); // closing the scanner because we have all of the inputs

        double result = 0;
        boolean isValid = true;

        switch (operator){

            case "+":
                result = numberOne + numberTwo;
                break;
            case "-":
                result = numberOne - numberTwo;
                break;
            case "x": //some people use x for multiplying so adding this case will add the option to use either * or x
            case "*":
                result = numberOne * numberTwo;
                break;
            case "/":
                result = numberOne / numberTwo;
                break;
            case "%":
                result = numberOne % numberTwo;
                break;
            default:
                System.out.println(operator + " is an invalid operator");
                isValid = false; //if operator is invalid then this will prevent printing the result since the result is tied to the condition
                //isValid is placed here because default is printed if the conditions are not met, meaning the result will only print if the condition is true

        }
        if (isValid) { //isValid is true by default but false when wrong operator is given, thus this will only print if correct operator is given
            System.out.println(numberOne + " " + operator + " " + numberTwo + " = " + result);
        }







    }
}
