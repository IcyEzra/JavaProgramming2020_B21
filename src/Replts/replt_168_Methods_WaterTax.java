package Replts;
import java.util.*;
public class replt_168_Methods_WaterTax {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        waterTax(scan.nextDouble());


    }








    public static double waterTax(double units)
    {
        double bill = 0.0;

        //your code here
        if(units <= 50){
            bill = units * 0.60;
        }else if(units > 50 && units < 100){
            bill = units * 0.90;
        }else if(units > 100 && units < 150){
            bill = (units * 0.90) + 50;
        }else{
            bill = (units * 0.90) + 100;
        }




        //end your code here
        System.out.println(bill);

        return bill;
    }//end waterTax

}
