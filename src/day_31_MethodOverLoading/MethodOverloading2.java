package day_31_MethodOverLoading;

public class MethodOverloading2 {

    public static void main(String[] args) {

        System.out.println( sum(10,20) );
        System.out.println( sum(10,20,30) );
        System.out.println( sum(10,20,30,40) );

        System.out.println( sum(10.5,46.7) );
        System.out.println( sum(45.1,23.1,33.0));
        System.out.println( sum(33.1,70.9,11.1,67.7));

    }

    public static int sum(int a, int b) { return a+b; }

    public static int sum(int a, int b, int c) { return a+sum(b,c); }

    public static int sum(int a, int b, int c, int d) { return sum(a,b,c) + d; }

    public static double sum(double a, double b) { return a+b; }

    public static double sum(double a, double b, double c) { return sum(a,c)+b; }

    public static double sum(double a, double b, double c, double d) { return sum(a,c)+sum(b,d); }

}
