package day_44_InheritanceCont2.RemoteWebDriverTask;

import day_39_ConstructorIntro.CybertekStudent;

public class Test {

    public static void main(String[] args) {

        //ChromeDriver driver = new ChromeDriver();
        //FireFoxDriver driver = new FireFoxDriver();
        CybertekDriver driver = new CybertekDriver();
        driver.get("Apple.com");
        driver.maximize();
        driver.close();

    }

}
