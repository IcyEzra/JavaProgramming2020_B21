package Personal;

import java.util.Scanner;

public class replt_122_findNonDup {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below
        for(int i = 0; i < nums.length; i++){

            int count = 0;
            for(int each : nums){

                if(each == nums[i]){
                    count++;
                }
            }
            if(count ==1){
                System.out.println( nums[i] );
            }

        }


    }
}
/*
int single = 0;
        for(int each : nums){
            if(each != nums[each]){
                single += each;
            }
        }
        System.out.println(single);


44
44
12
12
32
32
10

     int single = 0;
        for(int i = 0; i <= nums.length-1; i++) {
            if(nums[i] != nums[i]){
                single += nums[i];
            }
        }
        System.out.println(single);

 */