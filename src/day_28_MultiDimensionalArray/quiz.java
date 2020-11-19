package day_28_MultiDimensionalArray;

import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String result = "";
        for(int i = 0; i<word.length(); i++){
            if(word.contains("X") && word.contains("x")){
                result += i;
            }
        }
    }
}