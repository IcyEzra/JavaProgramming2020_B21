package Replts;

import java.util.ArrayList;

public class replt_MethodsWithArrayList_search {
    public static String search(ArrayList<String> r, String find)
    {
        String result = "";
        for(String each : r){
            if(each.contains(find)){
                result = each;
                break;
            }else{
                result = "search failed";
            }
        }

        return result;
    }//end wineSeller

    public static void main(String[] args)
    {

        ArrayList<String>  arr = new ArrayList<String>();
        arr.add("2");
        arr.add("6");
        arr.add("foo bar");
        arr.add("abc");


        String find_tst = search(arr,"foo");
        System.out.print(find_tst);//foo bar


    }//end main
}
