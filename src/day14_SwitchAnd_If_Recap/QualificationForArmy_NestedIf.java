package day14_SwitchAnd_If_Recap;

public class QualificationForArmy_NestedIf {
    public static void main(String[] args) {
        String citizen = "USA";
        boolean isResident = true;
        boolean isAlien = false;
        int age = 25;
        boolean hasHasHighSchoolDiploma = false;

        if (citizen == "USA" || isResident || isAlien){

            if (age >= 17 && age <= 34){

                if (hasHasHighSchoolDiploma){
                    System.out.println("You are qualified for the U.S Army");
                }else{
                    System.err.println("You must have a high school diploma");
                }

            }else {
                System.err.println("You must be between 17 to 34 years old");
            }


        }else {
            System.err.println("You must be U.S. citizen or a resident or alien");
        }







    }
}
