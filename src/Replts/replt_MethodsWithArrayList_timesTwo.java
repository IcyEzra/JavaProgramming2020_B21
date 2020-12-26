package Replts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class replt_MethodsWithArrayList_timesTwo {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5));


        timesTwo(nums);

    }

/*
    public static void timesTwo(ArrayList<Integer> nums){
        for(int i = 0, j = 1; i < nums.size(); i++){
            nums.set(i,j*2);
            j++;
        }

        System.out.println(nums);
    }
 */

    public static ArrayList<Integer> timesTwo(ArrayList<Integer> nums){
        ArrayList<Integer> timesTwo = new ArrayList<>();
        for(int each : nums){
            timesTwo.add(each*2);
        }
        System.out.println(timesTwo);
        return timesTwo;
    }
}
