package Personal;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;
import java.util.Scanner;

public class replt_160_PrintUniqueWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for(int i=0; i < size; i++){
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words){
        //WRITE YOUR CODE HERE
        String[] arr = new String[words.length];
        for(int i = 0; i <= words.length-1; i++){
            for(String each : words){
                arr[i] = each;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
