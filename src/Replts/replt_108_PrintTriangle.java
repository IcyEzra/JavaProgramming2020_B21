package Replts;

import java.util.Scanner;

public class replt_108_PrintTriangle {

    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String x = "";
        for(i = 1; i <= n; i++){

            x += "*";
            System.out.println(x);
        }
    }
}
