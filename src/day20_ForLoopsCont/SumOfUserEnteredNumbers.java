package day20_ForLoopsCont;

import java.util.Scanner;

public class SumOfUserEnteredNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    /*  repeated statements, we can use a for loop for this task
        System.out.println("Enter a number");
        int n1 = scan.nextInt();

        System.out.println("Enter a number");
        int n2 = scan.nextInt();

        System.out.println("Enter a number");
        int n3 = scan.nextInt();

        System.out.println("Enter a number");
        int n4 = scan.nextInt();

        System.out.println("Enter a number");
        int n5 = scan.nextInt();

        int result = n1 + n2 + n3 + n4 + n5;
        System.out.println("Sum: " + result);
      */
        int result = 0; // outside of the loop, given temporary value
        for(int i = 1; i <= 5; i++){
            System.out.println("Enter a number");
            result += scan.nextInt();
            System.out.println("Sum: " + result);
        }


    }
}
