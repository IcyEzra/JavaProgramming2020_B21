package day_29_Methods;

import java.util.Scanner;

public class VoidMethodPractice2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        sumOf3Nums(10,20,30);

        sumOf3Nums(-10,90,-3000);

        // sumOf3Nums(scan.nextInt(), scan.nextInt(), scan.nextInt()); way to use scanner to get user input for method

        greaterNum(440,440);

        greaterNum(5000,2);
    }

    public static void sumOf3Nums(int n1, int n2, int n3){
        System.out.println("Sum is : " + (n1+n2+n3));
    }

    public static void greaterNum(int n1, int n2){

        if(n1>n2){
            System.out.println(n1 + " is greater");
        }else if(n2>n1){
            System.out.println(n2 + " is greater");
        }else{
            System.out.println("Equal");
        }

    }



}
