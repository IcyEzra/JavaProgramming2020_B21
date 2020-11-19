package day09_IfStatement;

public class OddEven {
    public static void main(String[] args) {
        int number = 1000;

        boolean even = number % 2 == 0;
        if (even){
            System.out.println(number + " is even number");
        }

        if (!even){
            System.out.println(number + " is odd number");
        }

    }
}
