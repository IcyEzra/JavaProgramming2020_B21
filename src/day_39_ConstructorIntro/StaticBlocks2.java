package day_39_ConstructorIntro;

public class StaticBlocks2 {

    public static void main(String[] args) {
        System.out.println("Main Method");
    }


    // static block will be executed first regardless of hierarchy
    static {
        System.out.println("Static Block");
    }

    // you can also make multiple static blocks but one is commonly the best
    static {
        System.out.println("Static Block 2");
    }

}
