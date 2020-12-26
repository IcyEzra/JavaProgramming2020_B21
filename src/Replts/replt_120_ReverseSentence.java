package Replts;

import java.util.Scanner;

public class replt_120_ReverseSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";
        //TODO: start your code here
        String[] parts = sentence.split(" ");
        for(int i = parts.length-1; i >= 0; i--){
            reversed += parts[i] + " ";

        }



        //End your code here. do not modify below statement
        System.out.println(reversed);

    }
}
