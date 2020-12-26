package Replts;

import java.util.Arrays;

public class replt_143_2DArrayMultiplicationTable {
    public static void main(String[] args) {
        int [][] multiplicationTable = new int[10][10];

        //TODO: type your code below
    for(int d = 0; d <= 9; d++) {
        for (int i = 0, x = 0, y = 1, z = 1, j = 0; i <= 9; i++, j++) {
                multiplicationTable[x][i] = (i + y) * z;
            }
        }

        /*
        for(int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                multiplicationTable[1][i] = (i + 1) * 2;
            }
        }
        for(int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                multiplicationTable[2][i] = (i + 1) * 3;
            }
        }
        for(int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                multiplicationTable[3][i] = (i + 1) * 4;
            }
        }
        for(int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                multiplicationTable[4][i] = (i + 1) * 5;
            }
        }
        for(int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                multiplicationTable[5][i] = (i + 1) * 6;
            }
        }
        for(int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                multiplicationTable[6][i] = (i + 1) * 7;
            }
        }
        for(int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                multiplicationTable[7][i] = (i + 1) * 8;
            }
        }
        for(int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                multiplicationTable[8][i] = (i + 1) * 9;
            }
        }
        for(int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                multiplicationTable[9][i] = (i + 1) * 10;
            }
        }

         */

/*
        multiplicationTable[0][0] = 1;
        multiplicationTable[0][1] = 2;
        multiplicationTable[0][2] = 3;
        multiplicationTable[0][3] = 4;
        multiplicationTable[0][4] = 5;
        multiplicationTable[0][5] = 6;
        multiplicationTable[0][6] = 7;
        multiplicationTable[0][7] = 8;
        multiplicationTable[0][8] = 9;
        multiplicationTable[0][9] = 10;


 */


        //Do not modify below line it will be used to test your code. And
        //Can be used by you while developing your code
        System.out.println(Arrays.deepToString(multiplicationTable) ) ;
    }
}
/*
int[] x = new int[multiplicationTable.length];
        for(int[] each2DArray : multiplicationTable){
            for(int each1D : x){
                each2DArray[each1D] = 1;




            }
        }


        for(int[] each : multiplicationTable) {
            for (int eachNum : each) {
                for (int i = 10; i >= 1; i--) {
                    each[eachNum] = i;

                }
            }
        }
 */