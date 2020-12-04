package day_30_ReturnMethods;

import java.util.Arrays;

public class ReturnMethods3 {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9};
        int max = max(array);
        int max2 = max2(array);

        System.out.println("max = " + max);

        System.out.println("max = " + max);

        System.out.println(max > 100); // false


        int min = min(array);

        System.out.println("min = " + min);
        System.out.println(min < -2);

    }

    public static int max(int[] arr){
        int max = arr[0];

        for(int each : arr){
            if(each > max){
                max = each;
            }
        }

        return max;
    }

    public static int max2(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public static int min(int[] arr){
        int min = arr[0];

        for(int each : arr){
            if(each < min){
                each = min;
            }
        }


        return min;
    }


}
