package Day_50_Polymorphisim.PhoneTask;

public class iPhone extends Phone implements AppleApps{

    public iPhone(String model, String size, String color, double price) {
        super("iPhone", model, size, color, price);

        if(price > 1500){
            throw new RuntimeException("Invalid Price: price cannot be more than $1500");
        }

    }

    @Override
    public void downloadApp() {
        System.out.println("Downloading Apps from "+appStoreName);
    }

    @Override
    public void text() {
        System.out.println("iPhone is texting");
    }

    @Override
    public void call() {
        System.out.println("iPhone is calling");
    }

    @Override
    public String toString() {
        return "iPhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", OS= " + OS +
                '}';
    }
}
