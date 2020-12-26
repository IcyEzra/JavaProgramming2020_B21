package library;

import java.util.Arrays;

public class ArraysUtility {

// Finds max int in array
    public static int max(int[] arr){
        int max = arr[0];

        for(int each : arr){
            if(each > max){
                max = each;
            }
        }

        return max;
    }


// Finds min int in array
    public static int min(int[] arr){
        int min = arr[0];

        for(int each : arr){
            if(each < min){
                each = min;
            }
        }


        return min;
    }

// Combines two given arrays and returns new array
    public static int[] combineTwoArrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;

        for(int each : arr1){
            arr3[i++] = each;
        }

        for(int each : arr2){
            arr3[i++] = each;
        }
        return arr3;
    }

// sorts Array in descending order and returns it as an array
    public static int[] sort(int[] arr){
        Arrays.sort(arr);
        int[] reversedArray = new int[arr.length];

        for(int i = arr.length-1, j = 0; i >= 0; i--, j++){
            reversedArray[j] = arr[i];
        }
        return reversedArray;
    }

// returns the minimum number from an array of double
    public static double min(double[] arr){
        double min = arr[0];

        for(double each : arr) {
            if (each < min) {
                min = each;
            }
        }

        return min;
    }

// returns the maximum number from an array of double
    public static double max(double[] arr){
    double max =arr[0];
    for( double each  : arr ){
        if(each > max){
            max = each;
        }
    }
    return max;
}

// Combines two arrays of double and return the new array
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

// Combines two arrays of char and return the new array

    public static char[] combineTwoArrays(char[] arr1, char[] arr2){
        char[] arr3 = new char[arr1.length+arr2.length];
        int i = 0;

        for(char each : arr1){
            arr3[i++] = each;
        }

        for(char each : arr2){
            arr3[i++]  = each;
        }

        return arr3;
    }

// Combines two arrays of String and return the new array

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

// sorts the array of double in descending order, and returns it as an array

    public static double[] sort(double[] arr){  // {2,1,3}
        Arrays.sort(arr);  // {1,2,3};
        double[] reversedArray = new double[arr.length];  // {3, 2, 1}

        for(int i=arr.length-1, j = 0 ;  i>=0; i--, j++){
            reversedArray[j] = arr[i];
        }

        return reversedArray;
    }

// sorts the array of char in descending order, and returns it as an array

    public static char[] sort(char[] arr){  // {2,1,3}
        Arrays.sort(arr);  // {1,2,3};
        char[] reversedArray = new char[arr.length];  // {3, 2, 1}

        for(int i=arr.length-1, j = 0 ;  i>=0; i--, j++){
            reversedArray[j] = arr[i];
        }

        return reversedArray;
    }

// sorts the array of String in descending order, and returns it as an array

    public static String[] sort(String[] arr){
        Arrays.sort(arr);  // {1,2,3};
        String[] reversedArray = new String[arr.length];  // {3, 2, 1}

        for(int i=arr.length-1, j = 0 ;  i>=0; i--, j++){
            reversedArray[j] = arr[i];
        }

        return reversedArray;
    }

// replaces the [] with {}  while printing the array

    public static String printArray(int[] arr){
        String str = Arrays.toString(arr);
        str = str.replace("[", "{").replace("]", "}");
        return str;
    }

// adds element to the integer array

    public static int[] addElement(int[] array, int element){
        int[] result = new int[array.length + 1];

        for(int i = 0; i <= array.length-1; i++ ){
            result[i]  = array[i];
        }

        result[result.length-1] = element;

        return result;
    }

// adds element to the double array

    public static double[] addElement(double[] array, double element){
        double[] result = new double[array.length + 1];

        for(int i = 0; i <= array.length-1; i++ ){
            result[i]  = array[i];
        }

        result[result.length-1] = element;

        return result;
    }

// adds element to the char array
    public static char[] addElement(char[] array, char element){
        char[] result = new char[array.length + 1];

        for(int i = 0; i <= array.length-1; i++ ){
            result[i]  = array[i];
        }

        result[result.length-1] = element;

        return result;
    }

// adds element to the String array

    public static String[] addElement(String[] array, String element){
        String[] result = new String[array.length + 1];

        for(int i = 0; i <= array.length-1; i++ ){
            result[i]  = array[i];
        }

        result[result.length-1] = element;

        return result;
    }

// adds new int to int array

    public static int[] addElements(int[] arr1, int add){

        int[] result = new int[arr1.length+1];
        for(int i = 0; i <= arr1.length-1; i++){
            result[i] = arr1[i];
        }
        result[arr1.length] = add;
        return result;
    }

// adds new double to double array

    public static double[] addElements(double[] arr1, double add){

        double[] result = new double[arr1.length+1];
        for(int i = 0; i <= arr1.length-1; i++){
            result[i] = arr1[i];
        }
        result[arr1.length] = add;
        return result;
    }


}
