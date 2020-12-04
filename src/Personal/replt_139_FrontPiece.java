package Personal;

import java.util.Arrays;
import java.util.Scanner;

public class replt_139_FrontPiece {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE

        for(int i = 0; i <= size; i++) {
            if(size == 1) {
                System.out.println("[" + num[0] + "]");
                break;
            }else{
                System.out.println("[" + num[0] + "," + num[1] + "]");
                break;
            }
        }

    }
}
/*
    int[] x = new int[size];
        for(int i = 0; i <= 2; i++) {
                if (size == 2 || num.length == 1 || size == size) {
                x[i] = num[i];
                }
                }
                System.out.println(Arrays.toString(x));

 */