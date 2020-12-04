package day_31_MethodOverLoading;

import java.util.Arrays;

public class MethodOverLoading5 {

    public static void main(String[] args) {

        double[] arr1 = {1.5, 2.5, 3.5};
        double[] arr2 = {4.5, 5.5, 6.5, 7.5};
        double[] arr3 = {8.5, 9.5};
        double[] arr4 = {10.5, 11.5, 12.5};

        // using a method within a method
        double[] arr5 = combineTwoArrays( combineTwoArrays(arr1,arr2),combineTwoArrays(arr3,arr4) );
        System.out.println(Arrays.toString(arr5));

        int[] a1 = {1,2,3,4};
        int[] a2 = {5,6,7};
        int[] a3 = {8,9,10,11,12};

        int[] a4 = combineTwoArrays( a1 , combineTwoArrays(a2,a3) );

        System.out.println(Arrays.toString(a4));


    }

    public static String[] combineTwoArrays(String[] arr1, String[] arr2){
        String[] arr3 = new String[arr1.length+arr2.length];
        int i = 0;

        for(String each : arr1){
            arr3[i++] = each;
        }

        for(String each : arr2){
            arr3[i++]  = each;
        }

        return arr3;
    }

    public static double[] combineTwoArrays(double[] arr1, double[] arr2){
        double[] arr3 = new double[arr1.length+arr2.length];
        int i = 0;

        for(double each : arr1){
            arr3[i++] = each;
        }

        for(double each : arr2){
            arr3[i++]  = each;
        }

        return arr3;
    }

    public static int[] combineTwoArrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length+arr2.length];
        int i = 0;

        for(int each : arr1){
            arr3[i++] = each;
        }

        for(int each : arr2){
            arr3[i++]  = each;
        }

        return arr3;
    }


}
