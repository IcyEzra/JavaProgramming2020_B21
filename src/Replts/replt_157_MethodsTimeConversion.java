package Replts;

import java.util.Arrays;
import java.util.Scanner;

public class replt_157_MethodsTimeConversion {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    timeConversion(scan.nextLine());
}

    public static void timeConversion(String s) {
        /*
         * Write your code here.
         */
        String[] split = s.split(":");
        System.out.println(Arrays.toString(split));

        if(split[2].contains("PM")){
            switch (split[0]) {
                case "0":
                    split[0] = "12";
                case "1":
                    split[0] = "13";
                    break;
                case "2":
                    split[0] = "14";
                    break;
                case "3":
                    split[0] = "15";
                    break;
                case "4":
                    split[0] = "16";
                    break;
                case "5":
                    split[0] = "17";
                    break;
                case "6":
                    split[0] = "18";
                    break;
                case "7":
                    split[0] = "19";
                    break;
                case "8":
                    split[0] = "20";
                    break;
                case "9":
                    split[0] = "21";
                    break;
                case "10":
                    split[0] = "22";
                    break;
                case "11":
                    split[0] = "23";
                    break;
                case "12":
                    split[0] = "24";
                    break;


            }
        }

        System.out.println(split[0]+":"+ split[1]+":"+split[2].substring(0,2));
    }
}
