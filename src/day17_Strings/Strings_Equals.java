package day17_Strings;

public class Strings_Equals {
    public static void main(String[] args) {

        String str = "jira";
        String str2 = new String("jira");

        System.out.println(str == str2); //false because it compares objects location
        System.out.println(str.equals(str2)); // true because it compares objects value



    }
}
