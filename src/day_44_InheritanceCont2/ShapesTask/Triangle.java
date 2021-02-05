package day_44_InheritanceCont2.ShapesTask;

public class Triangle extends Shape {

    public double height, base, side;

    public Triangle(double height, double base) {
        super("Triangle");
        this.height = height;
        this.base = base;
        this.side = side;
    }

    @Override
    public double calcArea() {
        return base * height * .5;
    }

    @Override
    public double calcPerimeter() {
        return base + side * 2;
    }
}
