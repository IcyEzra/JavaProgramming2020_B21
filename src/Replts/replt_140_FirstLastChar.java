package Replts;

import java.util.Arrays;
import java.util.Scanner;

public class replt_140_FirstLastChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


        //TODO: Write your code below

        String[] characters = new String[words.length];

        for(int i = 0; i <= words.length-1; i++){
            String x = words[i].substring(0,1) ;
            String y = words[i].substring(words[i].length()-1);
            String z = x+y;
            characters[i] = z;
        }
        System.out.println(Arrays.toString(characters));
    }
}
