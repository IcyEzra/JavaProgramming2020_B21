package Replts;

import java.util.Scanner;

public class replt_Assessment6_mixedCase {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = "powerful";
        //write your code below

        char[] letters = s.toCharArray();
        String mixedCase = "";
        for(int i = 0; i <= s.length()-1; i++){
            if(i%2==0){
                mixedCase += s.substring(i,i+1).toLowerCase();
            }
            if(i%2!=0){
                mixedCase += s.substring(i,i+1).toUpperCase();
           }

        }
        System.out.println(mixedCase);
    }
}