package Replts;

import java.util.Arrays;

public class replt_180_Methods_Cover {

    public static void main(String[] args) {
        String answer = coverString("certfied wooden spoon", "o");
        System.out.println(answer) ; //java [me]thods

    }

    public static String coverString(String main, String coverME) {
       String result = "";
       String[] split = null;
       if(main.contains(coverME)){
           split = main.split(coverME);
           if(main.endsWith(coverME)) {
               for (int i = 0; i < split.length; i++) {
                   result += split[i] + "[" + coverME + "]";
               }
           }else{
               for(int i = 0; i < split.length-1; i++){
                   result += split[i]+"["+coverME+"]";
               }
               result += split[split.length-1];
           }

       }else{
           result = "["+main+"]";
       }


       return result;
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