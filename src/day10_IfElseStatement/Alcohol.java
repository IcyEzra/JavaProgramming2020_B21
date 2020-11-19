package day10_IfElseStatement;

public class Alcohol {
    public static void main(String[] args) {
        int age = 24;

        if(age>=21){
            System.out.println("Eligible to buy alcohol");
        }else{
            System.out.println("Eligible to buy milk");
        }
        System.out.println("=========================================");
        int year = 2020;

        if(year % 4 == 0){
            System.out.println(year+ " is leap year");
        }else{
            System.out.println(year+ " is not leap year");
            System.out.println("===============================================");


        }



    }
}
