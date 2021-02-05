package Office_Hours.Practice_10_21_2020_Scanner;

import java.util.Scanner;

public class Scanner_Practice2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a price");
        double price = scan.nextDouble();

        System.out.println("price: " + price);

        System.out.println("Enter name of item: ");
        String item = scan.next();

        System.out.println("Item: " + item);

        scan.nextLine(); // for enter key, we need this anytime we use nextLine()

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();
        scan.close();
        System.out.println("Full name: " + fullName);


    }
}
