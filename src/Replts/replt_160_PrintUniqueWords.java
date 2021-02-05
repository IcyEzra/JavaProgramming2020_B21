package Replts;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class replt_160_PrintUniqueWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = 7;
        //String[] words = {"java","python","java","code","python","C++","java"};
        String[] words = {"java", "code", "python", "code", "rust", "code", "rust"};

        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words){
        //WRITE YOUR CODE HERE
        String unique = "";

        for(int i = 0; i <= words.length-1; i++) {
            String word = words[i];
            int frequency = 0;

            for (String each : words) {

                if(each.equals(word)){
                    frequency++;
                }

            }
            if(frequency == 1){
                System.out.println(word);
            }

        }

    }
}
