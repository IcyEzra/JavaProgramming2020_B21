package day_33_ArrayLists;

import java.util.ArrayList;

public class ListPractice4 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(40);
        list.add(10);
        list.add(50);

        // indexOf(object) - returns first matching objects index number, as int
        int n1 = list.indexOf(10); // 0
        // lastIndexOf(object) - returns the last matching objects index num, as int
        int n2 = list.lastIndexOf(10); // 5

        System.out.println(n1);
        System.out.println(n2);

        System.out.println( list.contains(60) ); // false
        System.out.println( list.contains(50) ); // true

        System.out.println("=============================================");

        // task: remove unique characters and put into new list
        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('C');

        System.out.println(characters);

        ArrayList<Character> nonDup = new ArrayList<>();
       /* for loop version of solution
        for(int i = 0; i <= characters.size()-1; i++){
            if(!nonDup.contains(characters.get(i))){
                nonDup.add(characters.get(i));
            }
        }

        */
        // contains(object) - verifies if the object is contained in the list, returns boolean
        for(char each : characters){
            if(!nonDup.contains(each)){
                nonDup.add(each);
            }
        }
        System.out.println(nonDup);

        System.out.println("=================================");
        // equals(list) - compares if the given list is equal to the list, returns boolean
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);

        System.out.println(list1 == list2); // prints false because it also checks location and value
        System.out.println(list1.equals(list2)); // prints true because because it only checks value

        list1.clear();
        list2.clear();
        // isEmpty(list) - checks if given list is empty, returns boolean
        System.out.println(list1.isEmpty());
        System.out.println(list2.isEmpty());
    }
}
