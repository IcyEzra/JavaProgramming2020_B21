package day_34_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class SimpleLambdaExpressions {
    public static void main(String[] args) {
        // Predicate
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll( Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6) );

       /* loop for removing all numbers less than 5 but this loop does not do that correctly so don't do it
        for(int i = 0; i <= numbers.size()-1; i++){
            if( numbers.get(i) < 5 ){
                numbers.remove(i);
            }
        }
        */
        System.out.println(numbers);
        //removeIf(Predicate)
        //syntax - Predicate<DataType> name = p or element -> boolean expression

        Predicate<Integer> lessThan5 = each -> each < 5;

        numbers.removeIf(lessThan5);

        System.out.println(numbers);

        System.out.println("====================================");

        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.addAll( Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6) );

        numbers2.removeIf( element -> element < 7);
        System.out.println(numbers2);

        System.out.println("===================================================");

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll( Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20) );

        scores.removeIf( p -> p%3 == 0 || p%5 == 0 ); // removes all elements divisible by 3 and 5 at the same time
        // scores.removeIf( p -> p%5 == 0 );

        System.out.println(scores);

        System.out.println("====================================================");

        ArrayList<String> employees2 = new ArrayList<>();
        employees2.addAll( Arrays.asList("Ezra","Ember","Ezra","Uzair","Eustace","Gilbert","Ezra","Rumesh","Erlich","Ezra","Charlie") );

        employees2.removeIf( p -> p.startsWith("E") && !p.equals("Ezra") ); // removes all names that start with E except for Ezra

        System.out.println(employees2);

        System.out.println("=================================================");

        ArrayList<String> employee3 = new ArrayList<>();
        employee3.addAll( Arrays.asList("Ahmed","Ahmed","Erjon","Ahmed","Ahmed","Adel","Afrooz") );
        employee3.removeIf( p -> p.toLowerCase().contains("a") && p.toLowerCase().contains("r") ); // removes a word if it has a and r, so only Afrooz is removed

        System.out.println(employee3);



    }
}
