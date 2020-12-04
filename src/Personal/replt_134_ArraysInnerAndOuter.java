package Personal;

import java.util.Arrays;
import java.util.Scanner;

public class replt_134_ArraysInnerAndOuter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sizeInner = scan.nextInt();
        int sizeOuter = scan.nextInt();

        int[] inner = new int[sizeInner];
        int[] outer = new int[sizeOuter];

        for(int i =0; i < sizeInner; i++) {
            inner[i] = scan.nextInt();
        }
        for(int j =0; j < sizeOuter; j++) {
            outer[j] = scan.nextInt();
        }
        Arrays.sort(inner);
        Arrays.sort(outer);
        //WRITE YOUR CODE HERE

        boolean valid = true;
        int count = 0;
        for(int i = 0; i <= outer.length-1; i++){
            if(inner[0] == outer[i]){
                valid = true;
                count++;
            }else if(inner[1] == outer[i]){
                valid = true;
                count++;
            }
        }
        System.out.println(count);
        if(count == 1) {
            System.out.println(true);
        }else if (count != 1) {
            System.out.println(false);
        }



    }

}
/*
outer = new int[inner.length];
        for(int i = 0; i <= outer.length-1; i++){
            if(outer[i] == inner[i]){
                System.out.println(true);
            }

        }
 */