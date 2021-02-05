package Replts.calc_II_Encapsulation;

public class main {
    public static void main(String[] args) {


        Calc a = new Calc();
        a.setX(1);
        a.setY(1);
        a.plus();
        System.out.println("1+1 = "+ a.getResults());//1+1 = 2


    }
}
