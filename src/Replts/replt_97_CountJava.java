package Replts;

import java.util.Arrays;
import java.util.Scanner;

public class replt_97_CountJava {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word = scan.next();


        int count = 0;
        if(word.equals("java")){
           count = 1;
        }else {
            String check = "java";
            String[] split = word.split("java");
            count = split.length;
            System.out.println(Arrays.toString(split));
       }
        System.out.println(count);
    }
}
// failed