package Personal;

import java.util.Scanner;

public class replt_116_ArraysCountOfEvenNum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];
        for(int i = 0 ; i<=9 ; i ++){
            nums[i] = input.nextInt();
        }
        // above code will ask user 10 numbers while creating an array
        // just assume that you have int array with 10 numbers and start working on requirement
        // loop through the array and get the count of the even numbers
        //TODO: Write your code below
        int evenCount = 0;
        for(int i = 0; i <= nums.length-1; i++){
            if(nums[i]%2==0){
                evenCount++;
            }
        }
        System.out.println(evenCount);

    }
}
