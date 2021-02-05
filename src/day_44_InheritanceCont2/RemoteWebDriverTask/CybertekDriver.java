package day_44_InheritanceCont2.RemoteWebDriverTask;

public class CybertekDriver extends WebDriver{

    public CybertekDriver() {
        super("Cybertek Browser","V75.0.0");
    }

    @Override
    public void get(String URL) {
        System.out.println("Cybertek driver is opening "+URL);
    }

    @Override
    public void close() {
        System.out.println("Closing Cybertek Driver");
    }

    @Override
    public void maximize() {
        System.out.println("Maximizing Cybertek Driver");
    }
}
