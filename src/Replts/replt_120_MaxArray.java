package Replts;

import java.util.Scanner;

public class replt_120_MaxArray {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }

        //write your code below
        String max = "";
        for(int i = 0; i < words.length; i++){
            if(words[i].length() > max.length()){
                max = words[i];
            }
        }

           System.out.println(max);
    }

}

