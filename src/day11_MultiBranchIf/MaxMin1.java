package day11_MultiBranchIf;

public class MaxMin1 {
    public static void main(String[] args) {

        int num1 = 35;
        int num2 = 87;
        String MaxNum = " ";
        if (num1>num2){
            MaxNum = num1 + " is max";
        }else {
            MaxNum = num2 + " is max";
        }
        System.out.println(MaxNum);


        //how muhatar did this task
        int a = 10000;
        int b = 200;
        int max1 = 0;
        if (a>b) {
            max1 = a;
        }else {
            max1 =b;
        }
        int max2 = (a>b) ? a : b;
        System.out.println(max2);



        System.out.println(max1);

        System.out.println("====================");

        String Maximum = (num1>num2) ? num1 + " is maximum" : num2 + " is maximum";
        System.out.println(Maximum);



    }
}
