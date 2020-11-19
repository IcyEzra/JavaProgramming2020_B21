package day04_Variables;

public class Tax_Practice {
    public static void main(String[] args) {

        /*Write a program that can calculate the salary after tax based on the salary and tax rate
        Ex:
            if salary = 100000
                tax = 0.28
         */
        int salary = 100000;
        double tax = 0.28;
        double deduction = salary * tax;
        double SalaryAfterTax = salary - deduction;

        System.out.println("Total Tax taken:");
        System.out.println(deduction);
        System.out.println("Salary after tax:");
        System.out.println(SalaryAfterTax);


    }
}