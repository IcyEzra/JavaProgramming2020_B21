package Replts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class replt_96_RepeatSeparator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();


        String combine = "";
        if(count > 1 ){
            for(int i = 1; i <= count; i++){
                combine += word +","+ separator+",";
            }
        }else{
            System.out.println(word);
        }

        ArrayList<String> splitArr = new ArrayList<>(Arrays.asList(combine.split(",")));

        splitArr.remove(splitArr.size()-1);

        String answer = "";
        for(String each : splitArr){
            answer += each;
        }
        System.out.println(answer);

    }
}
/*
String combine = "";
        if(count > 1 ){
            for(int i = 1; i <= count; i++){
                combine += word + separator;
            }
        }else{
            System.out.println(word);
        }
        String[] split = combine.split("");
        String answer = "";

        for(int i = 0; i <= split.length-2; i++){
            answer += split[i];
        }

        System.out.println(answer);
 */