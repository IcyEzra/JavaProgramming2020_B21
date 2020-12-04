package day_33_ArrayLists;

import java.util.ArrayList;

public class ListIntro {

    public static void main(String[] args) {

        ArrayList <Integer> scores = new ArrayList<>(); // array list size is dynamic, meaning it can be changed

        //array method arrName.add(element) - adds element to the next available index
        scores.add(100); // autoboxing, index number 0
        scores.add(90); // index number 1
        scores.add(80); // index number 2 but becomes 3 once second add method is used b/c it specifically adds it to that index then moves the next ones over one space

        // inserts 300 into index 2
        scores.add(2,300);

        // to.String() not necessary because it array list has that implicitly
        System.out.println( scores );

        ArrayList<String> groceryList = new ArrayList<>(); // [Eggs, Water, Milk, Bread] Insert Toilet Paper between Eggs and Water
        groceryList.add("Egg"); // neither auto or unboxing
        groceryList.add("Water");
        groceryList.add("Milk");
        groceryList.add("Bread");
        groceryList.add(1,"Toilet Paper");
        groceryList.add(1,"Sanitizer");
        groceryList.add("N95 Masks");
        System.out.println(groceryList);

        //get(index) - gets the element at the given index
        String item1 = groceryList.get(2);
        System.out.println(item1);

        //size() - returns the total number of the elements (same with length in array)
        int total = groceryList.size();
        System.out.println(total);

        // this will retrieve the last index of array list
        System.out.println( groceryList.get(groceryList.size()-1) );




    }
}
