package day_41_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
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
