package Replts;

import java.util.Arrays;
import java.util.Scanner;

public class replt_138_reverseSentenceAgain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";
        //TODO: start your code here
       String[] split = sentence.split(" ");
       String word = "";
       for(int i = split.length-1; i >= 0; i-- ){
           word += split[i]+"  ";
       }
       String[] split2 = word.split(" ");
        System.out.println(Arrays.toString(split2));

        for(String each : split2){
            reversed += each+" ";
        }



        //End your code here. do not modify below statement
        System.out.println(reversed);

    }
}
