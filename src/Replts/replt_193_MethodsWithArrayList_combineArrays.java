package Replts;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class replt_193_MethodsWithArrayList_combineArrays {


    public static void main(String[] args) {

        String[] one = {"f","o","o"};
        String[] two = {" b","a","r"};
        combineRs(one,two);

    }


    public static String combineRs(String[] r1,String[] r2){
    String answer = "";

    for(String each : r1){
        answer += each;
    }
    for(String each : r2){
        answer += each;
    }

    System.out.println(answer);
    return answer;
    }
}
