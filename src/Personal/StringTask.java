package Personal;

import java.util.*;

public class StringTask {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
        Scanner scan = new Scanner(System.in);
        String item = scan.next();
        double balance = 100;
        if(item.equalsIgnoreCase("Smartphone") && item.equalsIgnoreCase("Laptop")){
            System.out.println("Sorry, not enough funds on your gift card!");
        }else if (item.equalsIgnoreCase("charger")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (balance - 15));
        }else if(item.equalsIgnoreCase("usb cable")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (balance - 10));
        }else if(item.equalsIgnoreCase("headphones")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (balance - 30));
        }else if(item.equalsIgnoreCase("pants")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (balance - 50));
        }else if(item.equalsIgnoreCase("hat")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (balance - 25));
        }else if(item.equalsIgnoreCase("socks")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (balance - 5));
        }else if(item.equalsIgnoreCase("blanket")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (balance - 60));
        }else if(item.equalsIgnoreCase("pillow")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (balance - 40));
        }else{
            System.out.println("Invalid item!");
        }





    }
}