package Replts;

public class replt_191_MethodsWithString_reverseString {
    public static void main(String[] args) {
        String word = "student";
        reverse(word);
    }


    public static String reverse(String input){
    String reverse = "";
    char[] arr = input.toCharArray();
    for(int i = input.length()-1; i >= 0; i--){
        reverse += arr[i]+"";
    }
        System.out.println(reverse);
        return reverse;
    }
}
