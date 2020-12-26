package Replts;

import java.util.ArrayList;
import java.util.Arrays;

public class replt_196_MethodsWithArrayLists_remove {

    public static void main(String[] args) {
        ArrayList<Double> dubs = new ArrayList<>(Arrays.asList(1.5,2.5,3.5,4.5));
        test(dubs);
    }


    public static void test(ArrayList<Double> dubs)
    {
        //write code here
        dubs.remove(0);
        dubs.remove(0);

        System.out.println(dubs);
    }
}
