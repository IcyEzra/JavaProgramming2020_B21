package day_44_InheritanceCont2.ShapesTask;

public class Cube extends Shape{

    public double side;

    public Cube(double side){
        super("Cube");
        this.side = side;

    }

    @Override
    public double calcArea() {
        return new Square(side).calcArea() * 6; // reuses square calcArea method to calculate area of cube
        // could also do side * side * 6
    }

    @Override
    public double calcPerimeter() {
        return new Square(side).calcPerimeter() * 6;
    }
}
