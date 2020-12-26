package Replts;

import java.util.Scanner;

public class replt_Assessment5_PrintVowels {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        char[] letters = word.toCharArray();
        String vowels = "";
        for(char each : letters){
            if(each == 'a' || each == 'e' || each == 'i' || each == 'o' || each == 'u'){
                vowels += each+"";
            }
        }
        System.out.println(vowels);
    }
}
