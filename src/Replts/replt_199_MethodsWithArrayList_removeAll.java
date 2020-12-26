package Replts;

import java.util.ArrayList;
import java.util.*;
import java.util.Collections;

public class replt_199_MethodsWithArrayList_removeAll {

    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<>();
        String word = "";
        removeAll(wordList,word);

    }



    public static void removeAll(ArrayList<String> wordList, String targetWord){

        for(int i = 0; i < wordList.size(); i++){
            if(wordList.get(i).equals(targetWord)){
                wordList.remove(i);
                i--;
            }
        }

    }
}
