package day_33_ArrayLists;

import java.util.ArrayList;

public class ListMethods {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(200);
        list1.add(300);

        //size(index, newElement) - replaces the old element at given index with new given element
        list1.set(1,400); // will replace 100 at index 1

        System.out.println(list1);

        ArrayList<String> names = new ArrayList<>();
        names.add("Yalcin");
        names.add("Amina");
        names.add("Ercan");
        names.add("Ercan");
        names.add("Tayfun");
        names.add("Mustafa");
        names.add("Tayfun");
        names.add("Suveyda");
        names.add("Egemen");


        System.out.println(names);

        names.set(3, "Afrooz");
        names.set(6,"Fiona");
        System.out.println(names);

        int[] arr = {10,20,30,40};
        arr[1] = 200;

        // remove(index)
        ArrayList<Character> list = new ArrayList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');
        // print statement before removal
        System.out.println(list);
        // removes given index and moves other values into place and readjusts Array list size
        list.remove(2);
        // print statement after removal
        System.out.println(list);
        // removes index 2 again and readjusts size
        list.remove(2);

        System.out.println(list);

        // remove(object)
        ArrayList<Character> list2 = new ArrayList<>();
        list2.add('A');
        list2.add('B');
        list2.add('C');
        list2.add('D');
        list2.add('E');

        //  Character ch = 'C';
        // list.remove('C'); out of bounds because C value = 67
        boolean r1 =  list2.remove( Character.valueOf('X')  ); // false
        boolean r2 =  list2.remove( Character.valueOf('C')  ); // true
        // remove(index) - removes object at given index, does not return (void)
        // remove(object) - overloaded method, removes the first matching object, returns boolean

        System.out.println(list2);
        System.out.println(r1);
        System.out.println(r2);




    }
}
