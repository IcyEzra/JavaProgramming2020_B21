package day_44_InheritanceCont2.ShapesTask;

public class Square extends Shape{

    public double side;

    public Square(double side){
        super("Square");
        this.side = side;

    }

    // override methods
    @Override
    public double calcArea(){
        return side * side;
    }
    @Override
    public double calcPerimeter(){
        return side+side+side+side;
    }

}
