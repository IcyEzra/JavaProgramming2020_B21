package Replts;

import java.util.Arrays;

public class replt_Assessment2_ReverseAnArray {
    public static void main(String[] args) {
        String[] arr = {"apple","pear"};

        String[] x = reverse(arr);
        System.out.println(Arrays.toString(x));

    }

    public static String[] reverse(String[] arr) {
        //write your codes here
        String[] reverse = new String[arr.length];

        for(int i = arr.length-1, j = 0; i >= 0; i--){
            reverse[j++] = arr[i];
        }

        return reverse;
    }
}
