package day07_UnaryOperators;

public class PrimitiveCasting {
    public static void main(String[] args) {
        short a = 3000;
        long b = a; //implicit casting, automatically done

        // int c = b; // casting must be done manually since datatype is larger
        int d = a; //casting done automatically

        double d1 = 200.5;
        int i1 = (int) d1; //manually casting datatype, since int is for whole numbers it will print 200
        System.out.println(i1);

        double d2 = 300;
        float f1 = (float) d2;

        long l2 = 300;
        System.out.println(l2);









    }
}
