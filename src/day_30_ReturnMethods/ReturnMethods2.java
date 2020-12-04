package day_30_ReturnMethods;

public class ReturnMethods2 {
    public static void main(String[] args) {

        String names = "racecar";

       //String reversedName = reverseStr1(names); won't assign because return method is void

        String reversedName = revereseStr2(names);

        boolean isPalindrome = names.equalsIgnoreCase(reversedName);

        System.out.println(isPalindrome);




    }
    // void
    public static void reverseStr1(String str){
        String result = "";

        for(int i = str.length()-1; i >= 0; i--){
            result += str.charAt(i);
        }

        System.out.println(result);
    }
    //return
    public static String revereseStr2(String str){
        String result = "";

        for(int i = str.length()-1; i >= 0; i--){
            result += str.charAt(i);
        }

        System.out.println(result);
        return result;
    }


}
