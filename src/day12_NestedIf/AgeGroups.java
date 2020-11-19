package day12_NestedIf;

public class AgeGroups {
    public static void main(String[] args) {
        int age = 10;
        String ageGroups = " ";

        if (age >=1 && age <=2){
            ageGroups = "infant";
        }else if (age <=5){
            ageGroups = "Toddler";
        }else if (age <=9){
            ageGroups = "Kid";
        }else if (age <=12){
            ageGroups = "Pre-Teen";
        }else if (age <=17){
            ageGroups = "Teenager";
        }else if (age <=20){
            ageGroups = "Young Adult";
        }else if (age <=39){
            ageGroups = "Adult";
        }else if (age <=49){
            ageGroups = "Young Middle-Aged Adult";
        }else if (age <=54){
            ageGroups = "Middle-Aged Adult";
        }else if (age <=64){
            ageGroups = "Very Young Senior Citizen";
        }else if (age <=74){
            ageGroups = "Young Senior Citizen";
        }else if (age <=84){
            ageGroups = "Senior Citizen";
        }else {
            ageGroups = "Old Senior Citizen";


        }
        System.out.println(ageGroups);
        String ageGroups2 = (age >=1 && age <=2) ? "Infant" : (age <=5) ? "Toddler" : (age <=9) ? "Kid" : (age <=12) ? "Pre-Teen" : (age <=17) ? "Teenager"
                : (age <=20) ? "Young Adult" : (age <=39) ? "Adult" : (age <=49) ? "Young Middle Aged Adult" : (age <=54) ? "Middle-Aged Adult" : (age <=64)
                ? "Very Young Senior Citizen" : (age <=74) ? "Young Senior Citizen" : (age <=84) ? "Senior Citizen" : "Old Senior Citizen";
        System.out.println(ageGroups2);
    }
}
/*
2. write a program that can define the age groups of a person
	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)
 */