package Day_49_Abstraction.RemoteDriverTask;

public interface WebDriver {

    void get(String URL);
    void close();
    void quit();


}