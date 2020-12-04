package day_34_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "AAABBCDDDDEEE";
        String result = "";  // A3B2C1D4E3

        ArrayList<String> list = new ArrayList<>(); // created in order to use the frequency method

        for(String each : str.split("")) list.add(each); // we get every character from str and add them into ArrayList so that we can use frequency method

        System.out.println(list);

        for(String each : list){
            int frequency = Collections.frequency(list, each);

            if(!result.contains(each)) // to avoid duplicated characters in the result
            result += each + frequency;
            /* if result contains each then it will skip and continue
            continue version of solution
            if(result.contains(each)){
                continue;
            }
            result += each + frequency;
             */
        }

        System.out.println(result);

        ArrayList<Character> ch1 = new ArrayList<>(Arrays.asList('A','B','C','D','E'));
        ch1.addAll( Arrays.asList('F','G','H','I','J') );
        System.out.println(ch1);

    }
}
