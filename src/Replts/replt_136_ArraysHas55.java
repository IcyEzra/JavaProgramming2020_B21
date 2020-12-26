package Replts;

import java.util.Arrays;
import java.util.Scanner;

public class replt_136_ArraysHas55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO Type your code below:
        boolean valid = true;

        Arrays.sort(nums);
        for(int i = 0; i <= nums.length-1; i++){
            if(nums[0] == 5 && nums[1] == 5){
                valid = true;
            }else if(nums[1] == 5 && nums[2] == 5){
                valid = true;
            }else if(nums[2] == 5 && nums[3] == 5){
                valid = true;
            }else if(nums[3] == 5 && nums[4] == 5){
                valid = true;
            }else{
                valid = false;
            }
        }

        System.out.println(valid);

    }
}
/*
1
5
4
1
5
 */