package Replts;

import java.util.ArrayList;

public class replt_195_MethodsWithArrayLists_size_get {

    public static int sum(ArrayList<Integer> ints)
    {
        //write code here
        int sum = 0;

        for(int each : ints){
            sum += each;
        }

        return sum;
    }
}

