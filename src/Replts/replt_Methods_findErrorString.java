package Replts;
import java.util.*;
public class replt_Methods_findErrorString {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean result = isError(scan.nextLine());
        System.out.println(result);

    }


    public static boolean isError(String line){
        boolean isValid = false;

        String[] split = line.split(" ");

        if(split[0].equalsIgnoreCase("error")){
            isValid = true;
        }else{
            isValid = false;
        }

        return isValid;
    }



}
