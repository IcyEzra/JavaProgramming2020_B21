package Replts;

import java.util.Scanner;

public class replt_169_Methods_3Locks {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        threeLocks(scan.hasNextBoolean(), scan.hasNextBoolean(),scan.nextBoolean());

    }


    public static boolean threeLocks(boolean a, boolean b, boolean c) {
        boolean answer = false;

        if(a == true && b == true || c == true){
            answer = true;
        }else{
            answer = false;
        }

        System.out.println(answer);

        return answer;
    }//end threeLocks
}
