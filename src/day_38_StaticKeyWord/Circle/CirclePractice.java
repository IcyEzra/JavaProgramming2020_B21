package day_38_StaticKeyWord.Circle;

public class CirclePractice {

    public double radius,diameter,area,perimeter;
    public double PI = 3.1416;

    public void setInfo(double radius){

       this.radius = radius;
       diameter = radius*2;
       perimeter = calculatePerimeter();
       area = calculateArea();
    }

    public String toString(){


        return "radius: "+radius+" diameter: "+diameter;
    }



    public CirclePractice() {
        this.radius = radius;
        this.PI = PI;
        this.diameter = diameter;
        this.area = area;
        this.perimeter = perimeter;
    }

    public double calculateArea(){
        double area = PI*(radius*radius);

        System.out.println("Area of CirclePractice: " + area);
        return area;
    }

    public double calculatePerimeter(){
        double perimeter = 2 * PI * radius;

        System.out.println("Perimeter of circle: "+perimeter);
        return perimeter;
    }

}
