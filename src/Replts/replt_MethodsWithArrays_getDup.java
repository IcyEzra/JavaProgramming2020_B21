package Replts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class replt_MethodsWithArrays_getDup {

    public static void main(String[] args) {

        String[] arr = {"1","g","aa","7","7","7","2","aa","7"};
        int answer = getDup(arr);
        System.out.println("answer = " + answer);
    }



    public static int getDup(String[] r) {

        String duplicates = "";

        for(int j = 0; j <= r.length-1; j++){

            String ch = r[j];
            int frequency = 0 ;

            for(int i = 0; i <= r.length-1; i++){ // for finding the frequency of one character at a time
                if( r[i] == ch){
                    frequency++;
                }
            }



            if(frequency > 1 ){ // if frequency is more than 1, it means the ch is duplicated
                // && !duplicates.contains( ""+ch ) ;  // in order to contain one char
                duplicates += ch;
            }


        }
        int count = duplicates.length();
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



     int count = 0;
    int totalCount = 0;
    String check = r[0];

    for(int i = 0, j = 1; i <= r.length-1; i++){
        if(check.equals(r[i])){
            count++;
        }
        if(count > 1){
            totalCount++;
            check = r[j];
            count = 0;
        }
        do {
            if(r[j].equals(r[i])){
                count++;
                if(count > 1){
                    totalCount++;
                    count = 0;
                    j++;
                }
            }

        }
        while(j == i);

    }

    return totalCount;
    }

 */
