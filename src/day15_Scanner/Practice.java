package day15_Scanner;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner person = new Scanner(System.in);

        System.out.println("Enter Height: ");
        double height = person.nextDouble();
        System.out.println("Your height: " + height);

        System.out.println("Enter shoe size: ");
        byte shoeSize = person.nextByte();
        System.out.println("Your shoe size: " + shoeSize);

        System.out.println("Do you like to wear hats? True or False: ");
        boolean hat = person.nextBoolean();
            if (hat == true){
                System.out.println("Yes I do wear hats");
            }else {
                System.out.println("No I abhor hats");
            }



    }

}
/*
- Ask the user to enter their height (double),
  shoe size (byte),
  and if they like to wear hats (boolean).
   Print out the information
 */