package day07_UnaryOperators;

public class UnaryOperators {
    public static void main(String[] args) {

        int a = -100;
        boolean r1 = a > 0; // verifies if a is positive
        boolean r2 = a < 0; // verifies if a is negative

        System.out.println(a + " is positive: " + r1);
        System.out.println(a + " is negative: " + r2);

        int b = -100 - 20; // = -120
        System.out.println(b);
        int c = 10 - -20; // 10 + 20 = 30
        int d = -10 * 4; // -40
        int e = 10 * -4; // -40
        int f = -10 * -4; // 40
        System.out.println("===================================================");

        int x =100;
        ++x; // increases value by = 101
        System.out.println(x);
        int y = 100;
        --y; //decreases value by 1 = 99
        System.out.println(y);
        int z = 100;
        System.out.println(--z);
        int x2 = 100;
        System.out.println(++x2);

        System.out.println("=====================================================");
        //POST:
        int a2 = 100;
        System.out.println(a2++); //100
        System.out.println(a2);

        int b2 = 100;
        System.out.println(b2--); // 100
        System.out.println(b2); // 99

        System.out.println("==========================================================");






    }
}
