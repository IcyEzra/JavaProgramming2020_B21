package day_42_Inheritance.DeviceTask;

public class Radio extends Device{

    public Radio(String brand, String model, double price){
        setInfo("Radio",brand,model,price);
    }

    public static boolean hasAmAndFm;

    static{
        hasAmAndFm = true;
    }

    public void changeStation(String stationName){
        System.out.println(brand+"'s station is changed to "+stationName);
    }

    public void changeFrequency(String frequency){
        System.out.println(brand+"s frequency has been changed to "+frequency);
    }
}
