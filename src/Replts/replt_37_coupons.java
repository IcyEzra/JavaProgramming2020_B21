package Replts;
import java.util.Scanner;
public class replt_37_coupons {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of coupons");
        int coupons = scan.nextInt();

        if(coupons<3){
            System.out.println("Not enough coupons");
        }else{
            int candyCount = coupons/10;
            int remainder = candyCount % 10;
            int gumballs = remainder/3;

            System.out.println("Number of Candies: " + candyCount);
            System.out.println("Number of Gumballs: " + gumballs);
        }

    }
}