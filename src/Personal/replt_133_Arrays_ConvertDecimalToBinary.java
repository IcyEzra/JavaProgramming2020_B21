package Personal;

import java.util.Arrays;
import java.util.Scanner;

public class replt_133_Arrays_ConvertDecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int decimal = input.nextInt();
        int[] binary = new int[8];

        //TODO: Write your code below.


        int value = 0;
        for(int i = binary.length-1; i >= 0; i--) {

            if (decimal <= 255) {

            while(decimal > 1) {

                if (decimal - 128 >= 0) {
                    binary[0] = 1;
                    decimal = decimal - 128;
                } else if (decimal - 64 >= 0) {
                    binary[1] = 1;
                    decimal = decimal - 64;
                } else if (decimal - 32 >= 0) {
                    binary[2] = 1;
                    decimal = decimal - 32;
                } else if (decimal - 16 >= 0) {
                    binary[3] = 1;
                    decimal = decimal - 16;
                } else if (decimal - 8 >= 0) {
                    binary[4] = 1;
                    decimal = decimal - 8;
                } else if (decimal - 4 >= 0) {
                    binary[5] = 1;
                    decimal = decimal - 4;
                } else if (decimal - 2 >= 0) {
                    binary[6] = 1;
                    decimal = decimal - 2;
                } else {
                    binary[7] = 1;
                    decimal = decimal - 1;
                }
                break;
            }

                if(decimal>0) {

                    if (decimal == 1) {
                        binary[binary.length - 1] = 1;
                    } else if (decimal == 2) {
                        binary[binary.length - 2] = 1;
                    } else if (decimal == 3) {
                        binary[binary.length - 1] = 1;
                        binary[binary.length - 2] = 1;
                    } else if (decimal == 4) {
                        binary[5] = 1;
                    } else if (decimal == 5) {
                        binary[5] = 1;
                        binary[7] = 1;
                    } else if (decimal == 6) {
                        binary[6] = 1;
                        binary[5] = 1;
                    } else if (decimal == 7) {
                        binary[7] = 1;
                        binary[6] = 1;
                        binary[5] = 1;
                    } else if (decimal == 8) {
                        binary[4] = 1;
                    } else if(decimal == 9){
                        binary[4] = 1;
                        binary[7] = 1;
                    }

                }


                }
            }
        System.out.println(Arrays.toString(binary));
        }


    }

/*
  I fucking did it :)
 */