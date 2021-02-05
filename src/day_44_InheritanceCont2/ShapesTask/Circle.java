package day_44_InheritanceCont2.ShapesTask;

public class Circle extends Shape {
    /*imported from Shape class
    variables: 4 (1 instance, 3 static)
    methods: 4 (4 instances)
     */

    public double radius, diameter;
    public static double PI;

    static{
        // either manually assign pi, or use math class
        // PI = Math.PI;
        PI = 3.14;
    }

    public Circle(double radius){
        super("Circle"); // must be the first thing we declare
        this.radius = radius;
        // setInfo("Circle"); // setInfo used from Shape class commeneted out because we use constructor from parent class to set the name
        diameter = radius * 2;
    }

    public double calcArea(){
        return radius * radius * PI;
    }

    public double calcPerimeter(){
        return PI*diameter;
    }


}
