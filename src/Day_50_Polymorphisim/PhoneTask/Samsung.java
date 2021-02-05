package Day_50_Polymorphisim.PhoneTask;

public class Samsung extends Phone implements AndroidApps{

    public Samsung(String model, String size, String color, double price) {
        super("Samsung", model, size, color, price);

        if(price > 1200){
            throw new RuntimeException("Invalid Price");
        }
    }

    @Override
    public void downloadApp() {
        System.out.println("Downloading from "+appStoreName);
    }

    @Override
    public void text() {
        System.out.println("Samsung "+brand+" is texting");
    }

    @Override
    public void call() {
        System.out.println("Samsung "+brand+" is calling");
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", OS= "+OS +
                '}';
    }
}
