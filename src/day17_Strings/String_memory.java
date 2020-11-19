package day17_Strings;

public class String_memory {
    public static void main(String[] args) {

        /*
           String pool:
     strOne --->       "java"     <---strTwo
     strFive ---->     "Java"

            Heap:
            "java"  <- strThree
            "java"  <- strFour

         */

        String strOne = "java"; // literal
        String strTwo = "java"; // literal //both references are pointed to the same "java" in the pool
        String strThree = new String("java"); // manually adds a new object to the pool (don't type original btw, add the "" then it will appear)
        String strFour = new String("java"); //adds another reference to the pool, even though it already exists, another object can be made

        System.out.println(strOne == strTwo); // prints true
        System.out.println(strOne == strThree); // prints false
        System.out.println(strThree == strFour); // prints false because both objects are not the same

        String strFive = "Java"; // made in string pool
        System.out.println(strOne == strFive); // false because of case





    }
}
