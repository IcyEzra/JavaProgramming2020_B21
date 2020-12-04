package day_30_ReturnMethods;
//importing custom String library class: import packageName.class;
import library.StringUtility;

import java.util.Arrays;

import library.ArraysUtility;

public class MethodCalls {
    public static void main(String[] args) {
        String str = "Level";

        String reversedName = StringUtility.reverse(str);

        System.out.println(str.equalsIgnoreCase(reversedName));

        String str2 = "aaaaabbbbbcccdddeeeee";

        String result2 = StringUtility.removeDuplicates(str2);
        System.out.println(result2);

        String str3 = "aaabcccdeeee";

        String result3 = StringUtility.unique(str3);
        System.out.println(result3);

        System.out.println("=================================");
        int[] array = {21,45,11,56,2,32,76};
        int[] descending = ArraysUtility.sort(array);

        System.out.println(Arrays.toString(descending));



    }
}
