package Replts;

import java.util.Scanner;

public class replt_186_removeFirstChar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        removeFirst(scan.next());
    }


    public static String removeFirst(String target) {
        String result = "";

        for(int i = 1; i <= target.length()-1; i++){
            result += target.charAt(i)+"";
        }
        System.out.println(result);
        return result;
    }
}
