package day_22_JavaRecap;

import java.util.Scanner;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();

        int count = 0; // counts amount of times a is divided by b and goes up everytime the while loop runs

        while(a >= b){ // loop will keep running while a is greater than or equal to b, it will run until b is greater
            a -= b; // subtracts b from a
            count++;
        }
        System.out.println(count + " with a remainder of " + a);


    }

}
/*
4. write a program that can divide two numbers without using / & %
   operators and returns the division and remainder




 */