package Personal;

import java.util.Scanner;

public class replt_155_PrintNext3Num {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number");
        int num = inp.nextInt();
        next3(num);

    }

    public static void next3(int num){

        int num1 = num + 1;
        int num2 =  num + 2;
        int num3 = num + 3;
        System.out.println(num1+" "+num2+" "+num3);

    }



}
