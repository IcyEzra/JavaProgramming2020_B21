package day_41_Encapsulation;

public class Data {

    public static String publicVariable = "A";
    private static String privateVariable = "B";
    static String defaultVariable = "C"; // default access modifier
    protected static String protectedVariable = "D";

    private Data(){ // you cannot use this constructor outside of the class

    }

    public static void publicMethod(){  // can be called in any class
        System.out.println("Public Method");
    }

    private static void privateMethod(){ // can only be called within the class
        System.out.println("Private Method");
    }

    static void defaultMethod(){  // can only be called within the classes that are within the package
        System.out.println("Default Method");
    }



}
