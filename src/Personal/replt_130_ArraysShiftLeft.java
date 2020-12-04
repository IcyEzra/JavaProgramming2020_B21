package Personal;

import java.util.Arrays;
import java.util.Scanner;

public class replt_130_ArraysShiftLeft {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < size; i++){
            nums[i] = scan.nextInt();
        }

        //WRITE YOUR CODE HERE
        int[] newArr = new int[nums.length];
        for(int i = 1; i <= nums.length-1; i++){
            newArr[i-1] = nums[i];
        }
        newArr[newArr.length-1] = nums[0];
        System.out.println(Arrays.toString(newArr));
    }
}
