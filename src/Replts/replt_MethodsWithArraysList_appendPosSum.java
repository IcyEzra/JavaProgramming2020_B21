package Replts;

import java.util.ArrayList;
import java.util.Arrays;

public class replt_MethodsWithArraysList_appendPosSum {


    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,-5,-6,-7,-8));
        appenPosSum(arr);
    }

    public static ArrayList<Integer> appenPosSum(ArrayList<Integer> arr){
        ArrayList<Integer> result = new ArrayList<>(arr);

        result.removeIf(p-> p < 0);
        int lastElement = 0;
        for(int each : result){
            lastElement += each;
        }
        result.add(lastElement);
        System.out.println(result);
        return result;
    }
}
