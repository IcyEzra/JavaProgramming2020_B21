package Replts;

import java.util.Scanner;

public class replt_121_countEvens {public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

    //TODO: Write your code below

         int evenCount = 0;
         for(int i = 0; i < nums.length; i++){
             if(nums[i] % 2 == 0){
                 evenCount++;
             }
         }
    System.out.println(evenCount);

    }
}

