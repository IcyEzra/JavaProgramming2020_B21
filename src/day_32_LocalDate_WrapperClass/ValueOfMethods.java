package day_32_LocalDate_WrapperClass;

public class ValueOfMethods {

    public static void main(String[] args) {

        String s1 = "123";
        int num1 = Integer.valueOf(s1); // unboxing, assigning a wrapper class to primitive

        Integer num2 = Integer.valueOf(s1);

        System.out.println(num1 + 1);

        String s2 = "2.5";
        double num3 = Double.valueOf(s2);
        System.out.println(num3 + 1);

        String s3 = "False";
        boolean r1 = Boolean.valueOf(s3); // unboxing

        System.out.println(r1);

        System.out.println(Integer.MAX_VALUE); // prints max integer value
        System.out.println(Integer.MIN_VALUE); // prints min integer value

    }

}
