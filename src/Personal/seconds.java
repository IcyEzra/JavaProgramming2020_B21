package Personal;

import java.util.*;

public class seconds {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int inputSeconds, hours, minutes, seconds;
        System.out.println("Enter seconds:");
        inputSeconds = scan.nextInt();
        hours = (inputSeconds / 60) /60;
        minutes = hours /60;
        System.out.println(hours);
        System.out.println(minutes);






    }
}
