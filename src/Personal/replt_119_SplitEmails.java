package Personal;

import java.util.Scanner;

public class replt_119_SplitEmails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();
        String[] parts = email.split("@");
        //Write your code below
        if(email.contains("@") && parts.length == 2 ) {

            String info = parts[0];
            String domain = parts[1];
            System.out.println("Email id: " + info);
            System.out.println("Email domain: " + domain);

        }else{
            System.out.println("invalid email");
        }
    }
}
