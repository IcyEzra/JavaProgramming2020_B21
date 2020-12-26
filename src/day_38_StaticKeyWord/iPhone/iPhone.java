package day_38_StaticKeyWord.iPhone;

public class iPhone {

    public String model, color, storage;
    public double price;

    public static String brand = "Apple", OS = "iOS", madeIn = "China";

    public void call(long phoneNumber){
        System.out.println("iPhone "+model+" is calling "+phoneNumber);
    }

    public static void getInfo(){
        System.out.println("Brand: "+brand);
        System.out.println("Operating System: "+OS);
        System.out.println("Made in: "+madeIn);
    }

    public String toString(){
        return "Brand: "+brand+", Model: "+model+", Color: "+color+", price: "+price+", Operating System: "+OS;
    }



}
/*
iphone:
    attributes:
        instance: model, color, price, storage
        static: brand, operating system, madeIn, designated
 */
