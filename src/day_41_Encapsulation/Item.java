package day_41_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class Item {

    public String name;
    public double unitPrice;
    public int quantity;

    public Item(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calcCost(){
        return quantity * unitPrice;
    }


    public String toString() {
        return "Item{" +
                "name= " + name + '\'' +
                ", unitPrice= " + unitPrice +
                ", quantity= " + quantity +
                ", total cost= " + calcCost() +
                '}';
    }
}

class ShoppingList{

    public static void main(String[] args) {


        ArrayList<Item> lst = new ArrayList<>(Arrays.asList(new Item("Apple", .50, 6),
                                                            new Item("Orange", .75, 10),
                                                            new Item("Kiwi", 1, 4),
                                                            new Item("Lemon", 2, 8),
                                                            new Item("DragonFruit", 5, 3)));
        double totalCost = 0;
        for(Item each : lst){
            totalCost += each.calcCost();

        }
        System.out.println(totalCost);
    }
}
