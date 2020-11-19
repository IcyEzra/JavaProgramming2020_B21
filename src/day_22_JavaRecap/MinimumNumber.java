package day_22_JavaRecap;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 999999999; // temp place holder, its a large value because we want the minimum value

        for(int i = 1; i <=5; i++){

            System.out.println("Enter a number");
            int n = scan.nextInt();
            if(n < min){
                min = n;
            }
        }
        System.out.println("min: " + min);



    }
}
