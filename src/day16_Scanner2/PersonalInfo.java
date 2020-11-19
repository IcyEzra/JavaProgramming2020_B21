package day16_Scanner2;

import java.util.*;

public class PersonalInfo {
    public static void main(String[] args) {
        /*

	Ask the user how many people they live with?
		if user lives with Less than 2 people: print "Live with less than 2 people"
		if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
		if the user lives with more than 6 people: print "Live with "more than 6 people"

	Ask the user what city they live in?
	Ask the user if the live in downtown ("yes or no")
		if you live downtown, ask them have you thought about moving to the suburbs? ("yes or no")
			if they have thought about it print "do it its great", if they have not print "You should think about it"

	Ask the user their favorite animal?
		Print "Wow %animal is a great animal"
	Ask the user how many pets they want?
		Print "Interesting, do you want %numberOfPets %favoriteAnimals?"

         */

        Scanner input = new Scanner(System.in);
        int points = 0;

        System.out.println("How many people are you living with");
        byte roommates = input.nextByte();

        if (roommates > 0 && roommates <=12) { // this will set the condition that roommates value cannot be bellow 0 or above 12

            if (roommates <= 2) { // only be 1 or 2
                points++;
            }else if (roommates < 7) { // includes 3 - 6
                points += 2;
            }else { // includes 7 - 12
                points += 3;
            }
        }else {
            System.err.println("Not a valid number of people");
        }

        System.out.println("What city do you live in?");
        String city = input.next();

        System.out.println("Do you live downtown? Yes or no");






    }
}
