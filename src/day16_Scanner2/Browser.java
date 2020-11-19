package day16_Scanner2;

import java.util.*;

public class Browser {
    /*
Write a program that will ask the user to enter a browser type (firefox, chrome, safari, opera, ie)
Handle case sensitivity
If a valid browser type is entered print ”Browser_type is opening...”
If the given browser is not valid print “Browser_type is not a valid browser
 */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Browser");
        String browserName = input.nextLine();

        input.close();

        switch(browserName){
            case "chrome":
            case "CHROME":   //adding this case will add the option for user to type either chrome or CHROME
                System.out.println("Chrome is opening");
                break;

            case "firefox":
            case "FIREFOX":
                System.out.println("Firefox is opening");
                break;

            case "opera":
            case "OPERA":
                System.out.println("Opera is opening");
                break;

            case "safari":
            case "SAFARI":
                System.out.println("Safari is opening");
                break;

            case "ie":
            case "IE":
                System.out.println("Internet Explorer is opening");
                break;

            default:
                System.out.println(browserName + "Browser is invalid");


        }





    }
}
