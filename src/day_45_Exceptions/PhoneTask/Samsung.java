package day_45_Exceptions.PhoneTask;

public final class Samsung extends Phone{ // since this class will not be inherited by any other class, it can be final

    public Samsung(String model, double price) { // since brand and country are declared, they are not needed in the argument
        super("Samsung", model, "South Korea", price);
    }

    public void freeze(){
        System.out.println(brand+" "+model+" is freezing");
    }
}
