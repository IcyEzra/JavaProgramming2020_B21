package day20_ForLoopsCont;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your number");
        int num = scan.nextInt();
        scan.close(); // last input to scanner is line 11 so we close it at line 12
        int result = 0; // temporary value

        if(num >= 1){ // condition for only positive numbers
            for(int i = 1; i <= num; i++){ // used for calculating the sum and add them into result
                result += i;
            }
            System.out.println("result = " + result);
        }else{
            System.err.println("Invalid entry");
        }





    }
}
