package day_44_InheritanceCont2.RemoteWebDriverTask;

public class ChromeDriver extends WebDriver{

    public ChromeDriver() {
        super("Chrome Browser","v84.0.1");
    }

    @Override
    public void get(String URL) {
        System.out.println("opening "+URL+" with chrome driver");
    }

    @Override
    public void close() {
        System.out.println("closing the chrome driver");
    }

    @Override
    public void maximize() {
        System.out.println("Maximizing chrome driver");
    }
}
