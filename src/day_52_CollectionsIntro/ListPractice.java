package day_52_CollectionsIntro;

import java.util.*;

public class ListPractice {

    public static void main(String[] args) {

        // List (I) - has index numbers, accepts duplicated objects

        // Has a relation with list V(linkedList, Vector, Stack) each of them have their own advantages
                            // separate classes
        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3,4,5));
        list1.removeIf(p-> p < 5);
        System.out.println(list1);

        List<Integer> list2 = new LinkedList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3,4,5)); // performs (add, remove, etc) faster than array list because doubly linked (adding and removing is faster)
        list2.removeIf(p-> p < 5); // faster
        System.out.println(list2);

        List<Integer> list3 = new Vector<>();

        List<Integer> list4 = new Stack<>();

    }

}
