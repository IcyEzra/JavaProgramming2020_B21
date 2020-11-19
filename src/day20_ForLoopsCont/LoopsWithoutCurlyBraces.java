package day20_ForLoopsCont;

public class LoopsWithoutCurlyBraces {

    public static void main(String[] args) {
        // with curly braces, anything within the braces will be executed
        for(int i = 1; i<=5; i++) {
            System.out.println("Hello");
            System.out.println("How are you");
        }
        System.out.println("=========================================");
// bad habit to not use curly braces so its good practice to use curly braces
        for(int i = 1; i <=5; i++)
            System.out.println("Hello"); // only this line will get executed 5 times
        System.out.println("How are you"); // this will not

    }
}
