package day_47_Abstraction.ShapeTask;

public class Circle extends Shape{ // concrete

    public final static double PI = 3.14;
    public double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public double area(){
        return PI*(radius*radius);
    }
     public double perimeter(){
        return 2*PI*radius;
     }
}
