package Replts.Pizza;

public class main {
    public static void main(String[] args) {

        Pizza pizza = new Pizza("large",0,0,2);
        System.out.println(pizza.calcCost());
        System.out.println(pizza.getDescription());

    }
}
