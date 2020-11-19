package Personal;

import java.util.*;

class Main {
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
        System.out.println("Enter your property type");
        houseType = scan.next();
        if(houseType.equalsIgnoreCase("condo")){
            propertyPrice += 50000;
        }else if(houseType.equalsIgnoreCase("townhouse")){
            propertyPrice += 75000;
        }else if(houseType.equalsIgnoreCase("single family house")){
            propertyPrice += 95000;
        }else{
            System.out.println("Invalid entry");
        }
        System.out.println("How many bedrooms do you have?");
        numberOfBedrooms = scan.nextInt();
        if(numberOfBedrooms > 0){
            propertyPrice += numberOfBedrooms*30000;
        }
        System.out.println("Do you have a backyard?");
        backyard = scan.hasNextBoolean();
        if(backyard==true){
            propertyPrice += 5000;
        }else{
            System.out.println("Backyard is not available for condo!");
        }
        System.out.println("Do you have a garage?");
        garage = scan.hasNextBoolean();
        System.out.println("How many spots?");
        garageSpots = scan.nextInt();

    }
}