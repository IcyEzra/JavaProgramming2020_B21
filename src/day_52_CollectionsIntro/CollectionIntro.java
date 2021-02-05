package day_52_CollectionsIntro;

import java.util.*;

public class CollectionIntro {

    public static void main(String[] args) {

        Collection<Integer> numbers = new ArrayList<Integer>();

        System.out.println(numbers.size());

        numbers.add(100);

        System.out.println(numbers.size());

        numbers.addAll(Arrays.asList(200,300,400,500));

        System.out.println(numbers.size());

        numbers.removeAll( Arrays.asList(100,400) );

        System.out.println(numbers.size());

        System.out.println(numbers);

        // System.out.println(numbers.get(1)); won't work
        // System.out.println( ((LinkedList)numbers).get(1) ); ClassCastException

        System.out.println( ((List)numbers).get(0) ); // down casting to use get method
    }
}
