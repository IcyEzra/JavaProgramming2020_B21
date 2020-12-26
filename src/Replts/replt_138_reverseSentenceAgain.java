package Replts;

import java.util.Arrays;
import java.util.Scanner;

public class replt_138_reverseSentenceAgain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";
        //TODO: start your code here
        String[] words = sentence.split(" ");
        String[] reverse = new String[words.length];
        for(int i = 0; i <= reverse.length-1; i++){
            reverse[i] = words[i];
        }

        System.out.println(Arrays.toString(reverse));
        String[] r = new String[words.length];
        for(int j = reverse.length-1; j >= 0; j--){
            reversed += reverse[j]+" " ;
        }



        //End your code here. do not modify below statement
        System.out.println(reversed);

    }
}
