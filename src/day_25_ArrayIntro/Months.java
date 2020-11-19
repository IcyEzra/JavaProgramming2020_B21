package day_25_ArrayIntro;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        //  index            0      1      2      3      4      5      6      7      8      9      10     11
        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        System.out.println(month[num-1]); // -1 because index starts at 0 so if you want Jan its 1 - 1 = 0
    }
}
