package Personal;

import java.util.Scanner;

public class emailContainString {
    public static void main(String[] args) {

            Scanner s = new Scanner(System.in);
            String word = s.next();
            String middleChar = "";
            if(word.length()%2!=0 && word.length()>=5){
                middleChar = word.substring(word.length()/2-1,word.length()/2+2);
                System.out.println(middleChar);
            }else{
                System.out.println("invalid");
            }


        }
    }

