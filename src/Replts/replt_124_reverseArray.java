package Replts;

import java.util.Arrays;
import java.util.Scanner;

public class replt_124_reverseArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below
        int[] reverse = new int[7];
        reverse[0] = nums[6];
        reverse[1] = nums[5];
        reverse[2] = nums[4];
        reverse[3] = nums[3];
        reverse[4] = nums[2];
        reverse[5] = nums[1];
        reverse[6] = nums[0];



        //Do not change below statement:

        System.out.println(Arrays.toString(reverse));
        }




    }

