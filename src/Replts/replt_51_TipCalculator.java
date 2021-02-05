package Replts;

import java.util.*;

public class replt_51_TipCalculator {

    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
        Scanner scan = new Scanner(System.in);
        System.out.println("Split:");
        String split = scan.next();

        if(split.equalsIgnoreCase("yes")) {
            System.out.println("Number of people:");
            int numOfPeople = scan.nextInt();
            System.out.println("Check amount:");
            double checkAmount = scan.nextDouble();
            System.out.println("Service Quality:");
            String serviceQuality = scan.next();

            String and = "";
            if(numOfPeople > 1){
                for(int i = 1; i <= numOfPeople; i++) {
                    and += "&";
                }
            }
            System.out.println("Number of people entered: " + and);

            double totalPay = 0;
            if(serviceQuality.equalsIgnoreCase("excellent")) {
                totalPay = (checkAmount*.25) + checkAmount;
            }else if(serviceQuality.equalsIgnoreCase("great")){
                totalPay = (checkAmount*.20) + checkAmount;
            }else if(serviceQuality.equalsIgnoreCase("good")){
                totalPay = (checkAmount*.15) + checkAmount;
            }else if(serviceQuality.equalsIgnoreCase("fair")){
                totalPay = (checkAmount*.10) + checkAmount;
            }else if(serviceQuality.equalsIgnoreCase("poor")){
                totalPay = (checkAmount*.05) + checkAmount;
            }else{
                totalPay = checkAmount;
            }

            System.out.println("Total to pay: "+totalPay);

            double totalTip = totalPay - checkAmount;
            System.out.println("Total tip: "+totalTip);

            double totalPerPerson = totalPay / numOfPeople;
            System.out.println("Total per person: "+totalPerPerson);

            double tipPerPerson = totalTip / numOfPeople;
            System.out.println("Tip per person: "+tipPerPerson);



        }
    }

}
