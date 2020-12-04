package Personal;

import java.util.Scanner;

public class replt_125_shortestWordArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {"asaaaa", "sass", "asasdasd",
                "dfsdfasfsda", "asdasfdasf", "sdasdasdasd"};

        String shortest = "";

            if(str[0].length() > shortest.length()){
                shortest = str[0];
            }
            if(str[1].length() < shortest.length()){
                shortest = str[1];
            }
            if(str[2].length() < shortest.length()){
            shortest = str[2];
            }
            if(str[3].length() < shortest.length()){
                shortest = str[3];
            }
            if(str[4].length() < shortest.length()){
                shortest = str[4];
            }
            if(str[5].length() < shortest.length()){
                shortest = str[5];
            }


        System.out.println(shortest);
    }
}
