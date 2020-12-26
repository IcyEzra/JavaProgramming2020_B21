package Replts;
import java.util.*;
public class replt_Assessment3_CarFactory {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String model = scan.next();
        int year = scan.nextInt();
        boolean recalled = false;

        if(model.equalsIgnoreCase("extravagant") && year == 2010){
            recalled = true;
        }else if(year == 2011){
            recalled = true;
        }else if(year == 2012){
            recalled = true;
        }else{
            recalled = false;
        }

        if(model.equalsIgnoreCase("guzzler") && year == 2015){
            recalled = true;
        }else if(year == 2016){
            recalled = true;
        }else if(year == 2017){
            recalled = true;
        }else if(year == 2018){
            recalled = true;
        }else{
            recalled = false;
        }
// fuck this assessment


    }

}
