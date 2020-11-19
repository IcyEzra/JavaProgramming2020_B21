package Personal;

import java.util.Scanner;

public class emailSubstringPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        int indexOf_ = email.indexOf("_");
        int indexOfAt = email.lastIndexOf("@");
        String firstName = email.substring(1,indexOf_);
        String firstChar = email.charAt(0)+"";
        String f = firstChar.toUpperCase();
        String lastName = email.substring(indexOf_+2,indexOfAt);
        String lastChar = email.substring(indexOf_+1,indexOf_+2);
        String l = lastChar.toUpperCase();
        String domain = email.substring(indexOfAt+1, email.lastIndexOf("."));
        String TopLevel =email.substring(email.lastIndexOf(".")+1,email.length()-1);



        System.out.println("First name: " + f+firstName);
        System.out.println("Last name: " + l+lastName);
        System.out.println("Domain: " + domain);
        System.out.println("Top-Level Domain: " + TopLevel);
    }

}
