package day_34_ArrayListContinue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Uniques {

    public static void main(String[] args) {
        String str = "aaaabaacddddeffffghhhhhhi";

        ArrayList<Character> list = new ArrayList<>();

        for(char each : str.toCharArray()) list.add(each); // getting each character from string and adding into the ArrayList

        System.out.println(list);

        for(Character each : list){
            if(Collections.frequency(list, each) == 1){
                System.out.print(each+" "); // prints unique characters
            }
        }

    }
}
