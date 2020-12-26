package Replts;
import java.util.*;
public class replt_174_PrintUniqueNumbers {public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    //int size = scan.nextInt();
    int[] nums = new int[7];
    int[] num = {1,2,3,5,1,2,3};
    printUniqueNumbers(num);
}

    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE
        int count = 0;
        int check = nums[0];
        for(int each : nums) {
            if(each != check){
                count++;

            }

        }

    }
}
