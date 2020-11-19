package day20_ForLoopsCont;

public class AlphabetBackwards {
    public static void main(String[] args) {
        // A ~ Z: 65 ~ 90 method below uses int for condition but cast to char for print
        for (int i = 90; i >=65; i--){
            System.out.print((char)i + " "); // prints alphabet backwards
        }
        System.out.println();
        // solution done with char to define condition, which means printed result doesn't have to be converted since it started as char
        // whereas previous solutions condition started with int so it needed to be casted
        for(char i = 'Z'; i >= 'A'; i--){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("==============================");
        //a ~ z: 97 ~ 122
        for(int i = 122; i >= 97; i--){
            System.out.print((char)i + " ");
        }
        System.out.println();
        for(char i = 'z'; i >= 'a'; i--){
            System.out.print(i + " ");
        }

    }
}
