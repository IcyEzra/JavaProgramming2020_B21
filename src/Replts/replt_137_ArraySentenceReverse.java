package Replts;

import com.sun.xml.internal.bind.v2.runtime.output.FastInfosetStreamWriterOutput;

import java.util.Arrays;
import java.util.Scanner;

public class replt_137_ArraySentenceReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //TODO: Type your code below
        String[] words = sentence.split(" ");
        String[] reverse = new String[words.length];
        int length = words.length;
        for(int i = words.length-1; i >= 0; i--){
            System.out.println(words[i]);
        }

    }
}
