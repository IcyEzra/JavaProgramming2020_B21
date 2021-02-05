package day_44_InheritanceCont2.CarTask;

public class Mercedes extends Car {


    public Mercedes( String model, String color, double price, int year) {
        super("Mercedes", model, color, price, year);
    }

    @Override
    public void start() {
        System.out.println("Push start button");
    }



}
