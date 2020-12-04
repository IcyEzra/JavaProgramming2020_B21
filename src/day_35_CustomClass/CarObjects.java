package day_35_CustomClass;

public class CarObjects {

    public static void main(String[] args) {

        //calls the instance variable from the Car class
        Car car1 = new Car(); // has own brand
        Car car2 = new Car(); // has own brand
        Car car3 = new Car(); // has own brand

        //if specifier is declared static in Car class then the brand copys will not be made
        //it will be assigned the last given value rather than make a copy
        car1.brand = "Toyota"; // first copy
        car2.brand = "BMW"; // second copy
        car3.brand = "Lexus";

        System.out.println( car1.brand ); // prints Toyota
        System.out.println( car2.brand );
        System.out.println( car3.brand );

        car1.model = "Corolla";
        car2.model = "M3";
        car3.model = "RX";

        System.out.println( car1.model );
        System.out.println( car2.model );
        System.out.println( car3.model );

        Car car4 = new Car();
        car4.setInfo("Mercedes", "C300", "Black",2008,90000.0); // using an instance method
        System.out.println( car4.brand );
        System.out.println( car4.model );
        System.out.println( car4.color );

        // print in this format: Year Brand Model Color
        // done via print statement
        System.out.println( car4.year + " " + car4.brand + " " + car4.model + " " + car4.color );
        // done by using instance method
        car4.getInfo();
    }
}
