package Office_Hours.Practice_10_21_2020;

import java.util.Scanner;

public class Scanner_Practice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your score");

        int score = scan.nextInt();
        scan.close();

        String grade = " ";

        if (score>=0 && score<=100){

            /* Multi branch if statement
            if(score>=90){
                grade = "A";
            }else if (score>=80){
                grade = "B";
            }else if (score>=70){
                grade = "C";
            }else if (score>=60){
                grade = "D";
            }else {
                grade = "F";
            }
                Ternary way of doing this exercise VVV
             */
            grade = (score>=90) ? "A" : (score>=80) ? "B" : (score>=70) ? "C" : (score>=60) ? "D" : "F";
        }else {
            grade = "Invalid";
        }
        System.out.println("Your grade is: " + score);
        System.out.println("Letter grade: " + grade);





    }
}
/*
precondition: 0 - 100
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: 0-59
 */