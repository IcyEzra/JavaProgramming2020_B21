package Day_50_Polymorphisim;

import day_42_Inheritance.AnimalTask.Animal;
import day_42_Inheritance.AnimalTask.Dog;
import day_46_JavaRecap.CarTask.BMW;
import day_46_JavaRecap.CarTask.Car;
import day_46_JavaRecap.CarTask.Tesla;
import Day_49_Abstraction.ShapeTask.Cube;
import Day_49_Abstraction.ShapeTask.Shape;

public class PolymorphismRules {


    public static void main(String[] args) {
        Dog dog = new Dog("A", "Husky", 'M',12, "White", "Small");
        dog.bark();

        Animal animal = new Dog("A", "Husky", 'M',12, "White", "Small");
        animal.eat("Dog food");
        // animal.bark();

        Cube cube = new Cube(5);

        System.out.println(cube.area());
        System.out.println(cube.perimeter());
        System.out.println(cube.volume());

        Shape shape = new Cube(5);

        System.out.println(shape.area());
        System.out.println(shape.perimeter());
        //  System.out.println(shape.volume());

        System.out.println("==========================================");

        Car car = new Tesla("Model 3", "White", 2019, 45000);
        // car.autoPilot();
        car.start();

        Car car2 = new BMW("X5", "red", 2018, 55000);
        car2.start();

        System.out.println("============================================");

        Animal animal2 = new Dog("Lucy", "Husky", 'M',12, "White", "Small");

        //  animal2.bark();
        ((Dog)animal2).bark();


    }

}