package day_47_Abstraction.CarTask;

public class CarShop {

    public static void main(String[] args) {

        BMW bmw = new BMW("X6","Black",2018,65000);
        Mercedes mercedes = new Mercedes("AMG","Blood Red",2019,75000);
        Toyota toyota = new Toyota("Corolla","Blue",2010,25000);
        Tesla tesla = new Tesla("Model 3","White",2019,55000);

        System.out.println("Start Mercedes - ");
        mercedes.start();

        System.out.println("Start Toyota - ");
        toyota.start();

        System.out.println("Start Tesla - ");
        tesla.start();

        System.out.println("Start BMW - ");
        bmw.start();
    }


}
