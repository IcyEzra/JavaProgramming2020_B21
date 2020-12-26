package Replts;

import java.util.Scanner;

public class replt_183_Methods_LimitString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        limit(scan.nextLine(),scan.nextInt());

    }



    public static String limit(String text, int maxLength){
        String result = "";
        char[] split = text.toCharArray();
        for(int i = 0; i <= maxLength-1; i++){
            result += split[i]+"";
        }
        System.out.println(result);
        return result;
    }
}
