package day17_Strings;

public class String_Mutability {
    public static void main(String[] args) {

        String wordOne = "Friday"; // new object in pool
        String wordTwo = wordOne;
        String wordThree = "Friday";
        wordOne = "Monday"; //new object added to string pool and changes the reference

        System.out.println(wordTwo);
        System.out.println(wordOne);
        System.out.println(wordOne == wordThree); // false because of line 9

    }
}
