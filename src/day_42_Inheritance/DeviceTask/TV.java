package day_42_Inheritance.DeviceTask;

public class TV extends Device{

   public TV(String brand, String model, double price){
       setInfo("TV",brand,model,price);
   }

    public static boolean hasChannel, hasCable;

    static{
        hasChannel = true;
        hasCable = true;
    }

    public void channelUp(){
        System.out.println("Channel up "+brand+" "+model);
    }

    public void channelDown(){
        System.out.println("Channel down "+brand+" "+model);
    }
}
