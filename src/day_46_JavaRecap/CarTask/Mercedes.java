package day_46_JavaRecap.CarTask;

public final class Mercedes extends Car{

    public Mercedes(String model, String color, int year, double price) {
        super("Mercedes", model, color, year, price);
    }

    @Override // optional, tells you if method is over written
    public void start(){
        System.out.println("Starting "+brand+" "+model+" by pushing start button");
    }
}
