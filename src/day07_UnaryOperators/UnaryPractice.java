package day07_UnaryOperators;

public class UnaryPractice {
    public static void main(String[] args) {

        int a = 100;
        int b = -a++ + ++a - a-- * a-- % 2;
             //-100 + 102 - 102 * 101 % 2 = 2

        System.out.println(b);
    }
}
