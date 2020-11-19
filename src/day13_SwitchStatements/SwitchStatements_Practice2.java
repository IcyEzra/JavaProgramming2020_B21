package day13_SwitchStatements;

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class SwitchStatements_Practice2 {
    public static void main(String[] args) {

        //browser options: chrome, IE, Edge, Safari, Opera, and Firefox.
        String browser = "ie";
        String selectedBrowser = " ";
        switch (browser){

            case "chrome":
                selectedBrowser = "CHROME BROWSER";
                break;
            case "firefox":
                selectedBrowser = "FIREFOX BROWSER";
                break;
            case "opera":
                selectedBrowser = "OPERA BROWSER";
                break;
            case "safari":
                selectedBrowser = "SAFARI BROWSER";
                break;
            case "edge":
                selectedBrowser = "EDGE BROWSER";
                break;
            case "ie":
                selectedBrowser = "INTERNET EXPLORER BROWSER";
                break;
            default:
                selectedBrowser = "INVALID BROWSER";








        }

        System.out.println(selectedBrowser);


    }
}
