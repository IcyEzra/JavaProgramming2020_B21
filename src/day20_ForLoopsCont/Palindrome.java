package day20_ForLoopsCont;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String word = scan.nextLine();

        String result = "";

        for(int i = word.length()-1; i>=0; i--){ // word.length()-1 gets the last index of string, iterator is i-- because we are going backwards
            result += word.charAt(i);
        }
        System.out.println("result: " + result);
/*         if version of result, ternary right below this code
        if(result.equalsIgnoreCase(word)) {
            System.out.println(word + " is palindrome ");
        }else {
            System.out.println(word + " is not palindrome");
        }

 */
        //ternary version of result
        System.out.println(word + (result.equalsIgnoreCase(word) ? " is a palindrome" : " is not a palindrome"));
    }
}
