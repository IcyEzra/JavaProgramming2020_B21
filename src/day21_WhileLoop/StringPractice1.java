package day21_WhileLoop;

import java.util.Scanner;

public class StringPractice1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        int lastIndex = word.length()-1;
        char f = word.charAt(0); // first character
        char l = word.charAt(lastIndex);

        //System.out.println(f + l); returns int value
        System.out.println(""+ f + l); // since a string is concatenated, it returns string
        System.out.println("===============================================");
        //address task






    }
}
