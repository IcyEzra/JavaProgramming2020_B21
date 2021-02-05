package Replts;

import java.util.Arrays;
import java.util.Scanner;

public class replt_90_PrefixAgain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = "abXYabc";
        int n = 2;
        boolean isValid = true;
        String part = str.substring(0,n);
        int count = 0;

        String[] split = str.split("",n+1);

        if(split[n].contains(part)){
            isValid = true;
        }else{
            isValid = false;
        }




        System.out.println(isValid);

    }


}
