package Replts;

import java.util.Scanner;
import java.util.*;

public class replt_Methods_extractNumberFromString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        extractNum(scan.next());

    }


    public static String extractNum(String s) {
    String result = "";
    char[] split = s.toCharArray();
    for(char each : split){
        boolean i = Character.isDigit(each);
        if(i == true){
            result += each;
        }
    }


        System.out.println(result);
        return result;
    }
}
