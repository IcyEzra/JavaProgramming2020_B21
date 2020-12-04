package day_33_ArrayLists;

import java.util.ArrayList;

public class ListPractice3 {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        students.add("Ezra"); // 0
        students.add("Uzair"); // 1
        students.add("Jotaro"); // 2
        students.add("Dio"); // 3
        students.add("Stan"); // 4
        students.add("Peter"); // 5
        students.add("Bruce"); // 6
        students.add("Dio"); // 7

        System.out.println(students);
        //removes via index
        students.remove(1);

        System.out.println(students);
        //removes first matching object via given object
        students.remove("Dio");

        System.out.println(students);
        //removes last index
        students.remove(students.size()-1);
        System.out.println(students);

        //removes every single element from list and sets index to 0
        students.clear();
        System.out.println(students);

    }
}
