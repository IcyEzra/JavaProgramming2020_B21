package Replts;
import java.util.Arrays;
import java.util.Scanner;

public class replt_190_MethodsWithArrays_MergeArrays {


    public static int[] mergR(int[] a,int[] b) {

        int[] arr = new int[a.length+b.length];

        int i = 0;

        for(int each : a){
            arr[i++] = each;
        }
        for(int each : b){
            arr[i++] = each;
        }


        System.out.println(Arrays.toString(arr));
        return arr;
    }//end mergR


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] one = {1,2,3,4,45,6,7,8};
        int[] two = {4,5,6};
        mergR(one,two);



    }
}
