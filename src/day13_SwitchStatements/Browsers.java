package day13_SwitchStatements;

public class Browsers {
    public static void main(String[] args) {
        String browserName = "Opera";
        boolean valid = browserName == "Chrome" || browserName == "Firefox" || browserName == "Opera" || browserName == "Safari" || browserName == "IE"
                || browserName == "Edge";

        if (valid) {

            if (browserName == "Chrome") {
                System.out.println("CHROME IS SELECTED BROWSER");
            } else if (browserName == "Firefox") {
                System.out.println("FIREFOX IS SELECTED BROWSER");
            } else if (browserName == "Opera") {
                System.out.println("OPERA IS SELECTED BROWSER");
            } else if (browserName == "Safari") {
                System.out.println("SAFARI IS SELECTED BROWSER");
            } else if (browserName == "IE") {
                System.out.println("INTERNET EXPLORER IS SELECTED BROWSER");
            } else {
                System.out.println("EDGE IS SELECTED BROWSER");
            }


        } else {
            System.out.println("No Such a browser");
        }


    }
}
