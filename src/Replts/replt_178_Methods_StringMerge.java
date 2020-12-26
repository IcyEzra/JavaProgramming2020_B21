package Replts;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.jar.JarEntry;

public class replt_178_Methods_StringMerge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String one = scan.next();
        String two = scan.next();
        String merge = mergeStrings(one,two);
        System.out.println(merge);

    }


    public static String mergeStrings(String one, String two) {
        String[] three = new String[one.length()+two.length()];
        String[] four = new String[one.length()+two.length()];
        three = one.split("");
        four = two.split("");
        String[] merge = new String[three.length+ four.length];

        if(one.length()==two.length()) {

            for (int i = 0, j = 0, k = 1; i <= three.length - 1; i++, j = j + 2, k = k + 2) {
                merge[j] = three[i];
                merge[k] = four[i];
            }
        }else if(one.length() < two.length()){

            for (int i = 0, j = 0, k = 1; i <= three.length-1 ; i++, j = j + 2, k = k + 2) {
                merge[j] = three[i];
                merge[k] = four[i];
            }
            for(int i = merge.length-three.length, j = three.length; i <= merge.length-1; i++,j++){
                merge[i] = four[j];
            }
        }else if(one.length() > two.length()){

            for(int i = 0, j = 0, x = 1; i <= four.length-1; i++,j=j+2,x=x+2){
                merge[j] = three[i];
                merge[x] = four[i];
            }
            for(int i = merge.length-four.length, j = four.length; i <= merge.length-1; i++,j++){
                merge[i] = three[j];
            }

        }else{
            System.out.println("nothing");
        }


        return Arrays.toString(merge);
    }
}
/*


 */