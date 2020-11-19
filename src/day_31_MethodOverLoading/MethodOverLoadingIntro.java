package day_31_MethodOverLoading;

import java.util.Arrays;

public class MethodOverLoadingIntro {

    public static void main(String[] args) {

    method(15,"a");
    System.out.println("===============================");
    int[] arr1 = {3,4,5};
    Arrays.sort(arr1);

    double[] arr2 = {2.5, 0.5, 1.5};
    Arrays.sort(arr2);

    char[] arr3 = {'a','c','b'};
    Arrays.sort(arr3);

    String[] arr4 = {"A","D","C"};
    Arrays.sort(arr4);


    }
    // method overloading: using same method name but with different parameters
    public static void method(){
        System.out.println("a");
    }
    public static void method(int a){
        System.out.println("b");
    }
    public static void method(String b){
        System.out.println("c");
    }
    public static void method(int a, String b){
        System.out.println("d");
    }
    public static void method(double a){
        System.out.println("e");
    }

}
