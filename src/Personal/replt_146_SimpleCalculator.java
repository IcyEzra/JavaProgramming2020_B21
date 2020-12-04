package Personal;

import java.util.Scanner;

public class replt_146_SimpleCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        plus(scan.nextInt(), scan.nextInt());


    }

    public static void plus(int num1, int num2){

        //your code here
        int result = num1+num2;
        System.out.println("result: " + result);
    }
}
