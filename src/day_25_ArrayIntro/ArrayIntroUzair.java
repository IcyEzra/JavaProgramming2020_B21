package day_25_ArrayIntro;

public class ArrayIntroUzair {
    public static void main(String[] args) {
        // String name = "Cybertek";

        String [] names = {"Ezra", "Kruziyet", "Seraphim", "Engrjio" };
             // index num -  0          1           2          3
        //retrieve data from array:

        System.out.println( names[2] );

        String str1 = names[3]; //Engrijio
        System.out.println(str1);

        int[] score = {80, 85, 90, 70, 75, 78};
          // index -    0   1   2   3   4   5
        /*
        System.out.println(names[1] + ": " + score[1]);
        System.out.println(names[0] + ": " + score[2]); // Ezra: 90
        System.out.println(names[3] + ": " + score[3]);
        */
        for(int i = 1; i <= 3; i++){
            System.out.println(names[i] + ": " + score[i]);
        }
        

    }
}
