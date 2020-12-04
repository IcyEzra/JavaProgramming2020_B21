package day_30_ReturnMethods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class WarmUpTasks {
    public static void main(String[] args) {

        positiveCheck(9);
        positiveCheck(0);
        positiveCheck(-6);

        System.out.println("=================================");

        int[] numbers = {1,2,3,4,-5,-6,-7,8,0,-11,10};
        for(int each : numbers){
            positiveCheck(each);
        }

        System.out.println("========================");

        gradeCalculator(67);
        gradeCalculator(101);
        gradeCalculator(-50);
        gradeCalculator(95);

        System.out.println("=============================");

        int[] a1 = {100,42,35};
        int[] a2 = {12,13,1994,420,69};

        combineTwoArrays(a1,a2);

        System.out.println("==========================");

        String letters = "aabbbbcdeeeefgggghiijjjk";

        removeDuplicates(letters);

        withoutDuplicates(letters);

        formattedFullName("uZAir", "baIg");
    }



    public static void positiveCheck(int num){
        if(num>0){
            System.out.println(num + " is positive");
        }else if(num<0){
            System.out.println(num + " is negative");
        }else{
            System.out.println("Number is zero");
        }
    }

    public static void gradeCalculator(int score){
        if(score >= 0 && score <= 100){
            System.out.println( (score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F' );
        }else{
            System.err.println("Invalid score");
        }


    }

    public static void combineTwoArrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0; // represents the index nums of arr3

        for(int each : arr1){
            arr3[i++] = each;
        }

        for(int each : arr2){
            arr3[i++] = each;
        }
        System.out.println(Arrays.toString(arr3));
    }

    public static void withoutDuplicates(String str){
        String result = "";

        for(String each : str.split("")){
            if(result.contains(each)){
                continue;
            }else{
                result += each;
            }
        }
        System.out.println(result);
    }

    // task4:                           "aabccb"
    public static void removeDuplicates(String str){
        String result = "";  //"abc"
/*
        for(char each : str.toCharArray() ){  //each: [a, a, b, c, c, b]
            if(!result.contains( ""+each )){
                result += each;
            }
        }
 */

        for( int i = 0; i <= str.length()-1; i++  ){
            if(!result.contains( ""+str.charAt(i) )){
                result += str.charAt(i);
            }
        }

        System.out.println( result);
    }

    //task 5: full name
    public static void formattedFullName(String first, String last){
        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
        last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();

        String fullName = first + " " + last;

        System.out.println(fullName);


    }


    }



/*
grades
100-90 - a
89-80 - b
79-70-c
69-65-d
64-0-f
 */