package day_46_JavaRecap.ShapeTask;

public class Rectangle extends Shape{

    public double width, length;

    public Rectangle(double width, double length) {
        super("Rectangle");

        if(width <= 0 || length <= 0){
            throw new RuntimeException("No such a Rectangle with a length and width of: "+length+" "+width);
        }

        setLength(length);
        setWidth(width);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double area(){
        return length*width;
    }

    public double perimeter(){
        return(length*2)+(width*2);
    }

}
/*
Create a class called Rectangle
    Attributes: l, w
    Add a constructor that can set the instances of the rectangle:
        if the length or width of the rectangle is 0 or negative, throw an exception with a message of "No such a Rectangle
        with a length and width of: l & w"
        replace l & w with given length and width
 */