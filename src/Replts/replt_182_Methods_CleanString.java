package Replts;
import java.util.*;
public class replt_182_Methods_CleanString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        clean("he said bla bla bla","bla");
    }



    public static String clean (String text ,String badWord) {
        String result = "";

        String[] split = text.split(" ");
        for(String each : split){
            if(!each.contains(badWord)){
                result += each+" ";
            }
        }

        System.out.println(result);
        return result;
    }


}
