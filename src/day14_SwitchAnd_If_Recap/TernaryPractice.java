package day14_SwitchAnd_If_Recap;

public class TernaryPractice {
    public static void main(String[] args) {
        // even or odd number, positive or negative or zero

        int num = 100;
        String result1 = (num%2 != 0) ? "Odd Number" : "Even Number";

        System.out.println(result1);

            String result2 = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";
        System.out.println(result2);

        //day of the week
        int n = 4; // 1 ~ 7
        if (n>=1 && n<=7){
        String day = (n==1) ? "Monday" : (n==2) ? "Tuesday" : (n==3) ? "Wednesday" : (n==4) ? "Thursday" : (n==5) ? "Friday" : (n==6) ?
                "Saturday" : "Sunday";
        System.out.println("The day is: " + day + "!");

        }else {
                System.err.println("Invalid number for the days");
        }



    }
}
