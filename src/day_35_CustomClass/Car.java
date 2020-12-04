package day_35_CustomClass;

public class Car {
    // Can be called outside of the class in other classes
    // if the specifier is declared static, the instance will only be able to called once, and its value is set once declared
    // if the specifier is not set then it will make a copy everytime it is declared, it will become an instance variable
    // instance variables are made within the class

    public String brand; // instance variable
    public String model;
    public String color;
    public int year;
    public double price;

    public void setInfo(String carBrand, String carModel, String carColor, int carYear, double carPrice){ //instance method
        brand = carBrand;
        model = carModel;
        color = carColor;
        year = carYear;
        price = carPrice;


    }

    public void getInfo(){
        System.out.println( year+" "+brand+" "+model+" "+color+" "+"$"+price );
    }

}
/*
Car class:
		Attributes: instance variables
			brand, model, color, price, year....
		actions: instance methods
			driver(), stop()....
 */
