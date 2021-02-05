package day_45_Exceptions.PhoneTask;

public class Phone extends Device{

    // Compiler will complain initially when extending class, you have to declare a constructor to take care of this
    // Use super keyword to call instance variable
    // know the difference between final and super
    public Phone(String brand, String model, String country, double price){
        super(brand, model, country, price);
    }

    public String toString(){
        return "Phone"+super.toString();
    }

    public void call(long number){
        System.out.println(brand+" "+model+" is calling "+number);
    }

    public void text(long number){
        System.out.println(brand+" "+model+" is texting "+number);
    }


}
