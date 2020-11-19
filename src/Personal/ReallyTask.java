package Personal;

import java.util.Scanner;

public class ReallyTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scan.next();
        scan.close();

        if(word.endsWith("ly")){
            System.out.println("Really???");
        }else {
            System.out.println("nevermind");
        }

    }
}
