package Replts;

import java.util.Arrays;

public class replt_180_Methods_Cover {

    public static void main(String[] args) {
        String answer = coverString("hello hello", "ello");
        System.out.println(answer) ; //java [me]thods

    }

    public static String coverString(String main, String coverME) {
       String result = "";
       String[] split = main.split(coverME);
        for(int i = 0; i <= split.length-1; i++){
            if(main.contains(coverME)){
                result += split[i]+"["+coverME+"]";

            }else{
                result = "["+main+"]";
            }
        }
        String result2 = "";
        if(result.endsWith("["+coverME+"]")){
            for(int i = 0; i <= result.length()-4; i++){
                result2 += result.charAt(i);
            }
        }

        return result2;
    }

}
/*
    String result = "";

        if(main.contains(coverME)){
                String[] split = main.split(coverME);

                System.out.println(Arrays.toString(split));
                result += split[0] + "[" + coverME + "]" + split[1];


                }else{
                result = "["+main+"]";
                }

                return result;

 */