package Office_Hours.Practice_11_26_2020_LoopAndArrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LoopsPractice2 {

    public static void main(String[] args) {

        /*
           salary calculator:
                hourlyRate
                weekLyHour
                tax rates: 30%
                continue?
         */
        Scanner scan = new Scanner(System.in);
        double hourlyRate = 0;
        int weeklyHour = 0;
        String answer = "";
        DecimalFormat df = new DecimalFormat("0.00");

        do { // becomes false if the answer is no

            System.out.println("Enter your hourlyRate");
            hourlyRate = scan.nextDouble();
            System.out.println("How many hours do you work in a week?");
            weeklyHour = scan.nextInt();
            double salary = weeklyHour * hourlyRate * 52;
            System.out.println("your salary: " + df.format(salary));
            double tax = salary * 0.3;
            System.out.println("Your tax: " + df.format(tax));
            double salaryAfterTax = salary - tax;
            System.out.println("Your salary after tax: " + df.format(salaryAfterTax));

            System.out.println("would you like to continue?");
            answer = scan.next().toLowerCase();

            while(  !(answer.equals("yes") || answer.equals("no"))  ){  // while the answer is invalid
                System.out.println("would you like to continue?");
                answer = scan.next().toLowerCase();
            }

        } while(answer.equals("yes"));










    }

}
