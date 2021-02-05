package Day_50_Polymorphisim;

import Day_49_Abstraction.RemoteDriverTask.ChromeDriver;
import Day_49_Abstraction.RemoteDriverTask.CybertekDriver;
import Day_49_Abstraction.RemoteDriverTask.FireFoxDriver;
import Day_49_Abstraction.RemoteDriverTask.WebDriver;
import Day_50_Polymorphisim.PhoneTask.Phone;
import Day_50_Polymorphisim.PhoneTask.Samsung;
import Day_50_Polymorphisim.PhoneTask.iPhone;
import day_47_Abstraction.ShapeTask.Circle;
import day_47_Abstraction.ShapeTask.Rectangle;
import day_47_Abstraction.ShapeTask.Shape;
import day_47_Abstraction.ShapeTask.Square;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismIntro {

    public static void main(String[] args) {

       // iPhone iphone1 = new iPhone("12 Pro Max","Large","Black",1000);

       // Samsung samsung1 = new Samsung("Galaxy S20","Large","Silver",900);

        // referencing parent class to child
        Phone phone1 = new Samsung("Galaxy S21","Large","Gray",900);

        Phone phone2 = new iPhone("12 Pro Max","Large","Black",1000);

        // since object type is parent class, you can store different phones into the array
        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(new iPhone("iPhone 11","small","black",1000));
        phones.add(new Samsung("Galaxy S10","Medium","White",1100));

        // List<Integer> list = new ArrayList<>();

        // Importing shapes task to test different shapes
        Shape shape;

        // shape = new Circle(3);
        // shape = new Rectangle(3,4);
        shape = new Square(5);

        System.out.println(shape.area());

        System.out.println("============================================================");

        String browserName = "chrome";

        WebDriver driver;

        switch (browserName){
            case "firefox":
                driver = new FireFoxDriver();
                break;

            case "chrome":
                driver = new ChromeDriver();
                break;

            case "cybertek":
                driver = new CybertekDriver();
                break;

            default:
                throw new RuntimeException("Invalid browser Name");
        }


    }


}
