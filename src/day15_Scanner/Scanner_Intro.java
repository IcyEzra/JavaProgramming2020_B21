package day15_Scanner;

import java.util.Scanner;

public class Scanner_Intro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter byte number: ");
        byte b = input.nextByte();

        System.out.println("Our number is: " + b);
        System.out.println("Plus one: " + (b + 1));

    }



}
