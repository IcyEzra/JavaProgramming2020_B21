package Personal;

import java.util.Scanner;

public class RealEstateCalculator {
    public static void main(String[] args) {

        //DO NOT CHANGE
        int propertyPrice = 0;
        int numberOfBedrooms, garageSpots;
        float metroAccessibility, schoolScore, highwayAccessibility;
        boolean backyard, smoking, garage;
        String houseType;
        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");
        //WRITE YOUR CODE HERE
        System.out.println("Enter your property type:");
        houseType = scan.nextLine();
        if(houseType.equalsIgnoreCase("condo") || houseType.equalsIgnoreCase("townhouse") || houseType.equalsIgnoreCase("single family home")) {
            switch (houseType) {
                case "condo":
                    propertyPrice += 50000;
                    break;
                case "townhouse":
                    propertyPrice += 75000;
                    break;
                case "single family home":
                    propertyPrice += 95000;
                    break;
            }
            System.out.println("How many bedrooms do you have?");
            numberOfBedrooms = scan.nextInt();
            propertyPrice += 30000 * numberOfBedrooms;

        System.out.println("Do you have a backyard?");
        backyard = scan.hasNextBoolean();
        if(backyard==true || houseType.equalsIgnoreCase("townhouse") || houseType.equalsIgnoreCase("single family home")) {
            propertyPrice += 5000;
            if (houseType.equalsIgnoreCase("condo") && backyard == true) {
                System.out.println("Backyard not available for condo!");
                propertyPrice -= 5000;
            }
        }
        System.out.println("Do you have garage?");
            garage = scan.nextBoolean();
            if (garage == true) {
                System.out.println("How many spots?");
                garageSpots = scan.nextInt();
                if (garage == true && garageSpots < 10) {
                    propertyPrice += 20000 * garageSpots;
                } else {
                    System.out.println("Pardon, it's not a public parking!");
                }
            }


        }
        System.out.println(propertyPrice);


    }
}

