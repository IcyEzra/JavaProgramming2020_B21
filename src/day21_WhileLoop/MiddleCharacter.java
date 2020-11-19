package day21_WhileLoop;

public class MiddleCharacter {
    public static void main(String[] args) {

        String word = "ka";

        if (word.length() % 2 != 0) {

            if (word.length() >= 3) { // if it has 3 or more characters
                System.out.println(word.charAt(word.length() / 2));
            } else if (word.length() == 1) {
                System.out.println(word + word + word);
            }
        }else { // even number of characters
            if(word.length() >=4){ // has more than 4 characters
                int m = word.length() /2; //gets the middle character
                System.out.println(word.charAt(m-1) + "" + word.charAt(m));
            }else{ // for two characters
                System.out.println(word + word);
            }
        }



    }
}
/*
1. When word has odd numbers of character and:
           - 3 or more characters, print middle letter
         oak --> a
         java --> v
           - Single character, print that character 3 times
        # --> ###
        q --> qqq
2. When word has even number of characters and:
          - 4 or more characters, print middle 2
       java --> av
       apples --> pl
       #$%^& --> %^
            - 2 characters, print those 2 characters twice
        @@ --> @@@@
        $$ --> $$$$
        hi --> hihi
 */