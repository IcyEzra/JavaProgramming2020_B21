package day_31_MethodOverLoading;

public class Addition {

    public static void main(String[] args) {

        System.out.println( additionOfTwoNumbers(100,200) );
        System.out.println( additionOfThreeNumbers(100, 200 , 300));
        System.out.println( additionOfFourNumbers(100, 200, 300, 400));

    }

    public static int additionOfTwoNumbers(int a, int b){
        return a+b;
    }
    public static int additionOfThreeNumbers(int a, int b, int c){
        return additionOfTwoNumbers(a,b)+c;
    }
    public static int additionOfFourNumbers(int a, int b, int c, int d){
        return additionOfTwoNumbers(a,b) + additionOfTwoNumbers(c,d);
    }



}
/*

    Task2:
        1. create a method that can find the addition of two numbers
                    method name: additionOf2Numbers
        2. create a method that can find the addition of three numbers
                    method name: additionOf3Numbers
        3. create a method that can find the addition of four numbers
                    method name: additionOf4Numbers

 */