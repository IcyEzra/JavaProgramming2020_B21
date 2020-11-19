package day_28_MultiDimensionalArray;

public class TwoDimensionalArray3 {
    public static void main(String[] args) {

        int[][] arr2D = {{1,2,3}, {4,5,6,7,8} ,{9,10,11,12,13}};
        //                  0           1             2

        for(int i = arr2D.length-1; i>=0; i--){
            for(int each : arr2D[i]){
                System.out.println(each+ " ");
            }
            System.out.println();
        }
        System.out.println("========================================");

        for(int[] each1DArray : arr2D){

            for(int i = each1DArray.length-1; i>=0; i--){
                System.out.print(each1DArray[i]+" ");
            }
        }

    }
}
