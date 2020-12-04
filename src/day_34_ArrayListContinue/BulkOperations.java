package day_34_ArrayListContinue;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {
        //containsAll method
        //containsAll(CollectionType) - verifies if the collection of elements are contained or not
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        //verify if 10 is contained in the list
        boolean r1 = list.contains(10);

        //verify if 10, 30, 50, and 60 are all contained in the list
        boolean r2 = list.contains(10) && list.contains(30) && list.contains(50) && list.contains(60);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);

        // verifies if 10, 30, 50, and 60 are all contained in list
        boolean r3 = list.containsAll( Arrays.asList( 10,30,50,60 ) );

        System.out.println("r3 = " + r3);

        ArrayList<String> group1 = new ArrayList<>();
        group1.add("Ezra");
        group1.add("Zero");
        group1.add("X");
        group1.add("Uzair");

        // Ezra, Zero, MegaMan
        boolean r4 = group1.containsAll( Arrays.asList("Ezra", "Zero", "MegaMan") ); // false

        System.out.println("r4 = " + r4);

        // Zero, X, Uzair
        boolean r5 = group1.containsAll( Arrays.asList("Zero", "X", "Uzair") ); // true

        System.out.println("r5 = " + r5);

        System.out.println("========================================================");
        //addAll(CollectionType) - adds multiple elements into the ArrayList

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll( Arrays.asList('A', 'Z', 'C', 'B', 'H', 'I', 'K') );
        System.out.println(chars);

        String[] names = {"Batman", "SuperMan", "SpiderMan", "Modok", "DeadPool", "IronMan", "Thanos", "Abomination" };
                                                     // adds names to list
        ArrayList<String> students = new ArrayList<>( Arrays.asList(names) );
        // Arrays.asList(ArrayValue) - returns the array value as collection type, only for non primitive arrays to use.
        // adds all of String[] names into students
        // this is one way to add to an array using addAll, but objects can also be added by placing .asList method in ArrayList parentheses, as shown above
        // students.addAll( Arrays.asList(names) );

        System.out.println(students);

        ArrayList<Character> ch1 = new ArrayList<>(Arrays.asList('A','B','C','D','E'));
        ch1.addAll( Arrays.asList('F','G','H','I','J') );
        System.out.println(ch1);

        System.out.println("=========================================");

        // removeAll(CollectionType) - removes all matching elements from the array list, if the element we to remove is unknown then we cannot use removeAll
        ArrayList<String> group2 = new ArrayList<>();
        group2.addAll( Arrays.asList(names) );

        System.out.println(group2);
        /* remove each villian using single remove method
        group2.remove("Modok");
        group2.remove("Thanos");
        group2.remove("Abomination");
         */
        // removes all given objects in one go and adjusts size
        group2.removeAll( Arrays.asList("Modok","Thanos","Abomination") );

        System.out.println(group2);
        System.out.println("======================================================");
        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(  Arrays.asList("Ahmed", "Ahmed", "Erjon", "Ahmed", "Ahmed", "Adil", "Afrooz") );
        /*
        don't use this way
        for(int i=0; i <= employees.size()-1; i++){
            if( employees.get(i).equals("Ahmed")  ){
                employees.remove(i); // without the interface iterable, remove method cannot be used in loop
            }
        }
        */
        // use this way
        employees.removeAll(  Arrays.asList("Ahmed") );

        System.out.println(employees);

        System.out.println("=========================================================");
        // retainAll(CollectionType) - removes all elements that are not matching
        ArrayList<String> employees2 = new ArrayList<>();
        employees2.addAll(  Arrays.asList("Ahmed", "Ahmed", "Erjon", "Ahmed", "Ahmed", "Adil", "Afrooz") );

        System.out.println(employees2);

        employees2.retainAll( Arrays.asList("Ahmed") );

        System.out.println(employees2);






    }
}
