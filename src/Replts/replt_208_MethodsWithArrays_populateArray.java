package Replts;

import java.util.Arrays;

public class replt_208_MethodsWithArrays_populateArray {

    public static int[] populate(int[] r)
    {
        //write your codes here

        for(int i = 0, j = 1; i <= r.length-1; i++){
            r[i] += j++;
        }

        return r;
    }

    public static void main(String[] args)
    {


        int [] i= new int[3];
        i= populate(i) ;
        System.out.println(Arrays.toString(i));

    }
}
