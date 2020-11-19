package day20_ForLoopsCont;

public class StringReverse {

    public static void main(String[] args) {
        //write a program that gives the reverse of given string
        String str = "abcdefgh";

        String result = " "; //"cba" , contains expected result which is the reverse of str

        for(int i = str.length()-1; i>=0; i--){ // regardless of word length, str.length()-1 will always get the word length
            result += str.charAt(i);
        }
        System.out.println(result);

    }
}
