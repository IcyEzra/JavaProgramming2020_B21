package Replts;
import java.util.*;
public class replt_164_Methods_return2Max {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        max(scan.nextInt(),scan.nextInt());
    }


    public static int max(int x,int  max) {

        if(max > x){
            max = x;
        }

        return max;
    }

}
