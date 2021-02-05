package Replts.Pizza;

public class Pizza {

    private String size;
    public int cheeseToppings, pepperoniToppings, hamToppings;

    public Pizza(String size, int cheeseToppings, int pepperoniToppings, int hamToppings) {
        this.size = size;
        this.cheeseToppings = cheeseToppings;
        this.pepperoniToppings = pepperoniToppings;
        this.hamToppings = hamToppings;
    }

    public double calcCost(){
        double price = 0;
        if(size.equalsIgnoreCase("Small")){
            price = 10 + (cheeseToppings*2)+(pepperoniToppings*2)+(hamToppings*2);
        }
        if(size.equalsIgnoreCase("Medium")){
            price = 12 + (cheeseToppings*2)+(pepperoniToppings*2)+(hamToppings*2);
        }
        if(size.equalsIgnoreCase("Large")){
            price = 14 + (cheeseToppings*2)+(pepperoniToppings*2)+(hamToppings*2);
        }
        return price;
    }

    public String getDescription(){
        return size+" Pizza with "+cheeseToppings+" Cheese toppings, "+pepperoniToppings+" Pepperoni toppings, and "+hamToppings+" Ham toppings"+'\n'+"Total Price: "+calcCost();
    }

}
