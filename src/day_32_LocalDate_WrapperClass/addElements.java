package day_32_LocalDate_WrapperClass;

import java.util.Arrays;

public class addElements {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = addElements(arr1,5);
        System.out.println(Arrays.toString(arr2));

    }

    public static int[] addElements(int[] arr1, int add){

        int[] result = new int[arr1.length+1];
        for(int i = 0; i <= arr1.length-1; i++){
            result[i] = arr1[i];
        }
        result[arr1.length] = add;
        return result;
    }

}
