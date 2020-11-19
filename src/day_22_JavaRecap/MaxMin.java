package day_22_JavaRecap;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = -999999999;
        int min = 999999999;

        for(int i = 1; i <= 5; i++){
            System.out.println("Enter a number");
            int n = scan.nextInt();

            if(n < min ){
                min = n;
            }
            if(n > max){
                max = n;
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

    }
}
