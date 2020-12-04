package day_32_LocalDate_WrapperClass;

public class Overloading {

    // you can overload the main method, but only the main method can execute the code
    public static void main(String[] args) {
        System.out.println("String");
        int[] arr1 = {1,2,3,4};
        main(arr1);
    }

    public static void main(int[] args){
        System.out.println("int");
    }

    public static void main(double[] args){
        System.out.println("double");
    }

    public static void main(char[] args){
        System.out.println("char");
    }

}
