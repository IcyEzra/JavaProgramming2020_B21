package day_28_MultiDimensionalArray;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        /*
        Scrum Team:
        Testers: {"Dorin", "Adil", "Fatih", "Ben"}
        Developers: {"James", "Jesse", "Ash",}
        SM: {"Walt"}
        PO: {"Gus"}
        BA: {"Spyro"}
         */
        String[][] scrumTeam = { {"Dorin", "Adil", "Fatih", "Ben"}, {"James", "Jesse", "Ash",}, {"Walt"}, {"Gus"}, {"Spyro"}};

        System.out.println(Arrays.deepToString(scrumTeam));

        for(int i = 0; i <= scrumTeam.length-1; i++){
            System.out.println(Arrays.toString(scrumTeam[i])); // prints each group in scrum team

            for(int j = 0; j <= scrumTeam[i].length-1; j++){
                System.out.println(scrumTeam[i][j]);
            }
        }
        System.out.println("================================================");
        //for each loop way of printing each array
        for(String[] eachGroup : scrumTeam){ //eachGroup = represents each 1D array in scrumTeam
            System.out.println(Arrays.toString(eachGroup));

            for(String eachName : eachGroup){
                System.out.println(eachName);
            }

        }



    }
}
