package day_28_MultiDimensionalArray;

public class LongestString {
    public static void main(String[] args) {

        String[] names = {"Sam" , "Jeff", "Bill", "IcyEzraX", "ZX"};

        String longest = names[0];
        String shortest = names[0];

        for(String each : names){

            if(each.length() > longest.length()){
                longest = each;
            }
            if(each.length() < shortest.length()){
                shortest = each;
            }

        }
        System.out.println("Longest string: " + longest);
        System.out.println("Shortest string: " + shortest);


    }
}
