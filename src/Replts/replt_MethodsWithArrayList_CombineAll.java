package Replts;

import java.util.ArrayList;
import java.util.Arrays;

public class replt_MethodsWithArrayList_CombineAll {


    public static ArrayList<String> combineAll(ArrayList<String> one, ArrayList<String> two){

        ArrayList<String> arr = new ArrayList<>();
        arr.addAll(one);
        arr.addAll(two);


        return arr;
    }
}
