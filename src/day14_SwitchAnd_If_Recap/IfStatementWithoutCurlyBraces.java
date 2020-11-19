package day14_SwitchAnd_If_Recap;

public class IfStatementWithoutCurlyBraces {
    public static void main(String[] args) {

        int a = 10;

        if(a%2==0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");

        // without { }, blocks can only contain one statement only
        //class goes in depth but its bad practice so always use { }

        System.out.println("===========================================");
        //not good behavior VV
        int b = 10;

        if (b > 0) System.out.println("Positive");
        else if (b < 0) System.out.println("Negative");
        else System.out.println("Zero");







    }
}
