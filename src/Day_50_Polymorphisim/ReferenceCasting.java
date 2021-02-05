package Day_50_Polymorphisim;

import Day_49_Abstraction.RemoteDriverTask.ChromeDriver;
import Day_49_Abstraction.RemoteDriverTask.WebDriver;
import Day_49_Abstraction.ShapeTask.Circle;
import Day_49_Abstraction.ShapeTask.Shape;
import day_48_Abstraction.AnimalTask.Animal;
import day_48_Abstraction.AnimalTask.Cat;
import day_48_Abstraction.AnimalTask.Dog;

public class ReferenceCasting {

    public static void main(String[] args) {

        // Implicit casting: smaller to larger
            int a = 10;
            double b = a;

        // Explicit casting: larger to smaller
            double d = 10.5;
            int c = (int)d;

        System.out.println("================================");

        // Up casting: smaller reference type to larger reference type (or implicit casting)
        Circle circle = new Circle(3);
        Shape shape = (Shape)circle;
        System.out.println("shape = " + shape);

        WebDriver driver = new ChromeDriver();

        // Down casting: larger reference type to smaller reference type
        Animal animal = new Dog("Lucy","Big",'F',10);
        // animal.bark(); can't call because reference type is to parent class, which doesn't have the method
        Dog dog = (Dog) animal; // changing reference type to child class
        dog.bark();

        // another example
        Animal animal2 = new Cat("Calico","calico","Benny",'M',4);
        ( (Cat)animal2 ).meow();
    }

}
