package day_40_Constructor;

public class Circle {

    // static variable
    public static double PI;

    // static block used to declare static variables
    static{
        PI = 3.14;
    }

    // instance variables
    public double r ,d, area, perimeter;

    // constructor used to initialize instance variables
    public Circle(double r){
        this.r = r;
        d = r * 2;
        area = r * r * PI;
        perimeter = d * PI;
    }
}
/*
Circle
		variables:
				radius, PI, diameter, area, perimeter
		add a constructor to initialize the instances
 */

class CircleObjects{

    public static void main(String[] args) {

        // in order to declare new circle object, a constructor is needed, if one isn't made, java automatically makes one with no argument,
        // but if one is made with an argument, a new object can't be declared without adding an argument
        // in this case, the only way to declare a circle is to give the radius in the argument
        // once declared, d, area, and perimeter are automatically generated
        Circle circle1 = new Circle(5);

        System.out.println(circle1.d);
        System.out.println(circle1.area);
        System.out.println(circle1.perimeter);
    }

}
