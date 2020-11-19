package day10_IfElseStatement;

public class WarmupTasks {
    public static void main(String[] args) {
        //Task 1 Valid Triangle
        String shape = "Triangle";
        int num1 = 50;
        int num2 = 70;
        int num3 = 90;

        boolean isTriangle = num1 + num2 + num3 == 180;
        boolean notaTriangle = !isTriangle; //this line was not needed

        if(isTriangle){
            System.out.println(shape +" is a triangle");
        }
        if(notaTriangle){
            System.out.println(shape + " is not a triangle");
        }
        System.out.println("============================================");
        //Task 2 Maximum and minimum ( use integers from previous task)
        boolean num1isMax = num1 > num2 && num1 > num3;
        boolean num2isMax = num2 > num1 && num2 > num3;
        boolean num3isMax = num3 > num1 && num3 > num2;
        if(num1isMax){
            System.out.println(num1 + " is maximum number");
        }
        if(num2isMax){
            System.out.println(num2 + " is maximum number");
        }
        if(num3isMax){
            System.out.println(num3 + " is maximum number");
        }
    //If number is minimum, alternative method
        boolean num1isMin = num1 < num2 && num1 < num3;
        boolean num2isMin = !num1isMin && num2 < num3;
        boolean num3isMin = !num1isMin && !num2isMin;
        String str = " is minimum number";
        if(num1isMin){
            System.out.println(num1 + str);
        }
        if(num2isMin){
            System.out.println(num2 + str);
        }
        if(num3isMin){
            System.out.println(num3 + str);
        }







    }
}
