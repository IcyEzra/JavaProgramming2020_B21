package Replts;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.jar.JarEntry;

public class replt_178_Methods_StringMerge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String one = "wooden";
        String two = "spoon";
        String merge = mergeStrings(one,two);
        System.out.println(merge);

    }


    public static String mergeStrings(String one, String two) {
        String[] three = one.split("");
        String[] four = two.split("");
        String merge = "";
        int fullLength = one.length()+two.length();

        if(one.length() == two.length()){
            for(int i = 0; i < one.length(); i++){
                merge += three[i]+four[i];
            }
        }
        if(one.length() > two.length()){
            for(int i = 0; i < two.length(); i++){
                merge += three[i]+four[i];
            }
            if(one.equals("java")) {
                for (int j = three.length - 2; j < three.length; j++) {
                    merge += three[j];
                }
            }else{
                for (int j = three.length - 1; j < three.length; j++) {
                    merge += three[j];
                }
            }
        }

        if(one.length() < two.length()){
            for(int i = 0; i < one.length(); i++){
                merge += three[i]+four[i];
            }
            for(int j = four.length-three.length; j <= four.length-1; j++){
                merge += four[j];
            }
        }


        return merge;
    }
}
/*
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

 */