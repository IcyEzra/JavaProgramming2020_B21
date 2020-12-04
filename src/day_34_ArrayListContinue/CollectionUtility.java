package day_34_ArrayListContinue;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionUtility {

    public static void main(String[] args) {
        ArrayList<Character> chars =  new ArrayList<>();
        chars.add('X');
        chars.add('Z');
        chars.add('Y');
        chars.add('W');
        chars.add('A');

        System.out.println(chars);
        //Collections.sort(ArrayList) - sorts array list in ascending order
        Collections.sort(chars);

        System.out.println(chars);

        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(70);
        scores.add(80);
        scores.add(60);
        scores.add(70);
        scores.add(50);
        scores.add(65);
        scores.add(75);

        Collections.sort(scores);

        System.out.println("Minimum Number: " + scores.get(0));
        System.out.println("Maximum Number: "+scores.get( scores.size()-1  ));

        System.out.println(scores);

        //Collections.swap(ArrayList, index 1, index 2) - swaps given indexes
        Collections.swap(scores, 2, 3 );

        System.out.println(scores);
        //swaps first and last index
        Collections.swap(scores, 0, scores.size()-1);

        System.out.println(scores);
        //swap without giving index but by giving objects
        Collections.swap(scores,  scores.indexOf(60), scores.lastIndexOf(70) );

        System.out.println(scores);

        System.out.println("=========================================");

        ArrayList<Character> list = new ArrayList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('A');
        list.add('D');
        list.add('A');
        list.add('A');
        list.add('A');
        list.add('A');
        list.add('A');
        list.add('A');
        System.out.println(list);
/*      for loop way way replacing A with E
        for(int i = 0; i <= list.size()-1; i++){
            char each = list.get(i);
            if(each == 'A'){
                list.set(i, 'E');
            }
        }
*/      //Easier way to replace A with E
        //Collections.replaceAll(ArrayList, Old Value, New Value) - replaces all given objects with new value in given ArrayList, make sure Old Value exists before replacing
        Collections.replaceAll(list, 'A', 'E');

        System.out.println(list); // [E, B, C, E, D, E, E, E]

        //Collections.frequency(ArrayList, Element) - returns the frequency of the given element, returns int
        int frequencyOfE = Collections.frequency(list, 'E');

        System.out.println("frequencyOfE = " + frequencyOfE);

        System.out.println("================================================");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(1000);
        nums.add(20);
        nums.add(200);
        nums.add(2000);
        nums.add(10);

        //Collections.max and min(ArrayList) - finds max or min in given array list, return type is the array list given datatype,
        // ex nums is an Integer array so return type is int.
        // if datatype was Double, then return type is double
        int max = Collections.max(nums);
        int min = Collections.min(nums);

        System.out.println("max = " + max);
        System.out.println("min = " + min);




    }
}