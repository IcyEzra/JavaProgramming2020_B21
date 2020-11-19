package Personal;

import java.util.Scanner;

public class loopVowels {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        for(int i = 0; i < word.length(); i++){
            if(word.contains("a")){
                System.out.print("a");
            }
            if(word.contains("e")){
                System.out.print("e");
            }
            if(word.contains("i")){
                System.out.print("i");
            }
            if(word.contains("o")){
                System.out.print("o");
            }
            if(word.contains("u")){
                System.out.print("u");
            }

        }


    }
}