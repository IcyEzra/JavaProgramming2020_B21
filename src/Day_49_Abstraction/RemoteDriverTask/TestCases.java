package Day_49_Abstraction.RemoteDriverTask;

import day_44_InheritanceCont2.RemoteWebDriverTask.WebDriver;

public class TestCases {
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.TakeScreenShot("pic");
        driver.close();

        System.out.println("----------------------------------");

        FireFoxDriver driver2 = new FireFoxDriver();
        driver2.get("https://www.google.com");
        driver2.TakeScreenShot("pic");
        driver2.close();

        System.out.println("------------------------------");

        // WebDriver driver3 = new ChromeDriver();

    }
}