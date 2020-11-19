package day16_Scanner2;

import java.util.*;  // this will import everything from the utility package (which includes Scanner)

public class Scanner_NextLine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your address");
        String address = input.nextLine(); // will accept multiple words

        System.out.println("Address: " + address);








    }
}
