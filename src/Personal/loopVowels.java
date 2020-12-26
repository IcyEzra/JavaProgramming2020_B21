package Personal;

import java.util.Scanner;

public class loopVowels {
    public static void main(String[] args) {


    }


    public static boolean appearsTwice(String target, String sentence) {
        //write your codes here:
        boolean valid = false;

        int count = 0;
        String[] split = sentence.split(" ");
        for(String each : split){
            if(each.equals(target)){
                count++;
            }
            if(count == 2){
                valid = true;
            }else{
                valid = false;
            }
        }

        return valid;
    }
}
/*
boolean valid = true;
    String[] split = sentence.split(" ");
        if(sentence.contains(target)) {
                valid = true;
                }else{
                valid = false;
                }


                return valid;

 */