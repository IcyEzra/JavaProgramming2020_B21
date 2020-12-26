package Replts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class replt_MethodsWithArrays_getDup {

    public static void main(String[] args) {

        String[] arr = {"1","2","aa","1"};
        int answer = getDup(arr);
        System.out.println("answer = " + answer);
    }



    public static int getDup(String[] r){
    int count = 0;



    return count;
    }
}

/*
int count = 0;

    String first = r[0];
    String second = r[1];
    Arrays.sort(r);

    ArrayList<String> arr = new ArrayList<>(Arrays.asList(r));

    for(int i = 0; i <= r.length-1; i++){
        if(!first.equals(second)){
            arr.removeIf(p->p.equals(first));
            arr.removeIf(p->p.equals(second));
        }else if(arr.get(0).equals(arr.get(1))){
            arr.removeIf(p->p.equals(arr.get(0)));
        }
        arr.removeIf(p->!p.equals(arr.get(0)));

    }



    System.out.println(arr);

    count = arr.size();
    return count;
 */
