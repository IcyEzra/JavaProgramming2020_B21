package Replts;

import java.util.ArrayList;
import java.util.Arrays;

public class replt_179_Methods_RemoveDuplicates {
    public static void main(String[] args) {
        //test your code
        System.out.println( uniqueChars("wooden-spoon") ) ;
    }

    public static String uniqueChars(String str) {
        //TODO: write your below
        String result = "";

        for(int i = 0; i <= str.length()-1; i++){
            if(!result.contains(""+str.charAt(i))){
                result += str.charAt(i);
            }
        }



        return result;
    }
}
