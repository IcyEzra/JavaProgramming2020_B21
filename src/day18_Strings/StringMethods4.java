package day18_Strings;

public class StringMethods4 {
    public static void main(String[] args) {
        //methods that return you boolean: isEmpty(), equals(), equalsIgnoreCase(), contains(), startsWith(), endsWith()
        //isEmpty
        String str = "Hello Everyone";
        System.out.println(str.isEmpty()); // false

        String str2 = "";
        System.out.println(str2.isEmpty()); // true

        //contains
        String sentence = "I like to learn Java";
        System.out.println(sentence.contains("Java")); // true
        System.out.println(sentence.contains("C#")); // false

        // startsWith(), endsWith()
        String webAddress = "www.amazon.com";
        boolean validAddress = webAddress.startsWith("www.") && webAddress.endsWith(".com"); //true
        System.out.println(validAddress);


    }
}
