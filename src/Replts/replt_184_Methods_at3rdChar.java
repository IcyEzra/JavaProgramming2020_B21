package Replts;
import java.util.*;
public class replt_184_Methods_at3rdChar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        at3(scan.next(),scan.next());

    }





    public static String at3(String target,String word){

        String result = "";

        String[] split = target.split("");
        for(int i = 0; i <= 2; i++){
            result += split[i];
        }
            result += word;
        for(int i = 3; i <= split.length-1; i++){
            result += split[i];
        }
        System.out.println(result);
        return result;
    }
}
