package day20_ForLoopsCont;

public class Alphabet {
    public static void main(String[] args) {

        for (int i = 65; i <= 90; i++){
            System.out.print((char)i + " "); // prints alphabet with spaces
        }
        System.out.println();
        //char version of solution
        for(char i = 'A'; i <= 'Z'; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        // lowercase task a ~ z: 97 ~ 122
        for (int i = 97; i <= 122; i++){
            System.out.print((char)i + " ");
        }
        System.out.println();
        //char version of lowercase task
        for (char i = 'a'; i <= 'z'; i++){
            System.out.print(i + " ");
        }

    }
}
/*
1.Write a program that will print out all of the alphabet

2.Write a program that will print out all of the alphabet backwards

this task requires the usage of a the ascii table and using char to return those values ex 65 is A 90 is Z
 */
