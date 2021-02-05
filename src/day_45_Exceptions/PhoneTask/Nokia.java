package day_45_Exceptions.PhoneTask;

public final class Nokia extends Phone{

    public Nokia(String model, double price) {
        super("Nokia", model, "Finland", price);
    }

    public void selfDefense(){
        System.out.println(brand+" "+model+" is being used for self defense");
    }

    public void breakTheFloor(){
        System.out.println(brand+" "+model+" is breaking the floor");
    }
}
