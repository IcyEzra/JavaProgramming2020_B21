package day17_Strings;

public class String_Length {
    public static void main(String[] args) {
        String s = "Pneumonoultramicroscopicsilicovolcanoconiosis";
        String s2 = "Word";

        System.out.println(s.length()); // 45
        System.out.println(s2.length()); // 4

        int len = s.length(); // stores number of characters to this variable

        System.out.println(len == s.length()); // true
        System.out.println(len == s2.length()); //false

    }

}
