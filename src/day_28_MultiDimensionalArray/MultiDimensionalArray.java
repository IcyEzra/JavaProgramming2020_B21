package day_28_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        int[] arr1 = {1,2};
                  //  0 1
        int[] arr2 = {3,4,5,6,7};
                 //   0 1 2 3 4
        int[] arr3 = {8,9,10,11,12,13};
                //    0 1  2  3  4  5

        int[][] arrays = { arr1, arr2, arr3};
                       //   0      1     2

        //retrieve the element: 6
        System.out.println( arrays[1][3] ); //6

        //retrieve the element: 8
        System.out.println( arrays[2][0] ); //8

        //retrieve the array {3,4,5,6,7}
        System.out.println(Arrays.toString(arrays[1])); // 1 dimensional array, toString only for 1 dimensional array

        //print entire arrays:
        System.out.println(Arrays.deepToString(arrays)); // deepToString only for multidimensional Arrays
        System.out.println(Arrays.toString(arrays)); // prints the hashcode of array

        System.out.println("==================================================================");

        String[][] batch21 = { {"name1","name2","name3"} ,
                             {"name4","name5","name6","name7","name8"} ,
                             {"name9","name10","name11","name12","name13","name14","name15"}};

        for(int i = 0; i <= batch21.length-1; i++){

            System.out.println( Arrays.toString( batch21[i] )); // for loop used to print out all arrays, i: index number of 1D arrays

        for(int j = 0; j<=batch21[i].length-1; j++){ // j: index numbers of elements of each 1D array
           System.out.println( batch21[i][j]);
            }

        }
        System.out.println("=======================================================");
        //task: reverse the array staring from the last element
        for(int u = batch21.length-1; u >= 0; u--){

            for(int j =batch21[u].length-1; j>=0; j--){
                System.out.print( batch21[u][j] );
            }
        }



    }
}
