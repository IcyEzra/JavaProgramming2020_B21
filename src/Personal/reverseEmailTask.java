package Personal;

import java.util.Scanner;

public class reverseEmailTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        if(!email.contains("_")){
            System.out.println(email);
        }else{
            String firstName = email.substring(0,email.lastIndexOf("_"));
            String lastName = email.substring(email.lastIndexOf("_")+1,email.lastIndexOf("@"));
            String end = email.substring(email.lastIndexOf("@"),email.lastIndexOf("m")+1);
            System.out.println(lastName+"_"+firstName+end);
        }



    }
}