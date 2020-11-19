package day15_Scanner;

import java.util.Scanner;
//import day_14_SwitchAnd_If_Recap.SalaryCalculator_MultiBranchIf;
// if we wanted to use the SalaryCalculator class in this class, we import it.

public class Scanner_Int {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number One:  "); // printing out instruction
        int numOne = scanner.nextInt(); // reading an int number
        System.out.println("Enter Number Two: "); // printing out what instruction (what the user should input)
        int numTwo = scanner.nextInt(); // reading an int number

        System.out.println("Number one: " + numOne);
        System.out.println("Number two: " + numTwo);
        System.out.println("Sum: " + (numOne + numTwo));

        //Why not just write out int numOne = 1000;? Because this way is hard coded or fixed value
        //but with scanner it is dynamic, whatever that means?
        //New task: ASk the user to enter an int number, print iff the number is even or odd.



    }
}
