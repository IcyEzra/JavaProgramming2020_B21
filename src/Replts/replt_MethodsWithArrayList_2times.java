package Replts;

import java.util.ArrayList;
import java.util.Arrays;

public class replt_MethodsWithArrayList_2times {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,5,3,7));
        twoTimes(list);
    }

    public static ArrayList<Integer> twoTimes(ArrayList<Integer> list){

        ArrayList<Integer> list2 = new ArrayList<>(list.size()*2);

        for(int i = 0, j = 0; i < list.size()*2; i++){
            list2.add(i,list.get(j));
            if(i%2!=0){
                j++;
            }

        }





        System.out.println(list2);
        return list2;
    }
}
/*
        list2.add(0, list.get(0));
        list2.add(1, list.get(0));
        list2.add(2, list.get(1));
        list2.add(3, list.get(1));
        list2.add(4, list.get(2));
        list2.add(5, list.get(2));
        list2.add(6, list.get(3));
        list2.add(7, list.get(3));

  */
