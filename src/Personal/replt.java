package Personal;

import java.util.Scanner;

public class replt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        char first = word.charAt(0);
        char lastChar = word.charAt(word.length()-1);
        System.out.println( "" +first + lastChar );

    }
}
