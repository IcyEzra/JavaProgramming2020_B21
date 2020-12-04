package day_34_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class CharacterLists {
    public static void main(String[] args) {

        String str = "abcd@!#$etyi123lkjhaqwer%^&879";

        ArrayList<String> digits = new ArrayList<>(Arrays.asList( str.split("") ) );
        digits.removeIf(p -> !Character.isDigit( p.charAt(0) )); // removes the characters that are not digits
        System.out.println(digits);

        ArrayList<String> letters = new ArrayList<>(Arrays.asList( str.split("") ));
        letters.removeIf(p -> !Character.isLetter(p.charAt(0))); // removes the characters that are not letters
        System.out.println(letters);

        ArrayList<String> specialCharacters = new ArrayList<>(Arrays.asList( str.split("") ));
      /*  one way of doing this
        specialCharacters.removeAll(digits); // removes all digits
        specialCharacters.removeAll(letters); // removes all letters
         */ // Another and easier way of doing this
        specialCharacters.removeIf( p -> Character.isLetterOrDigit(p.charAt(0)));
        // removes the characters that are digits or letters
         System.out.println(specialCharacters); // prints remaining characters
    }
}
