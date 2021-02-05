package day_47_Abstraction.ShapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Circle circle = new Circle(3.5);
        Rectangle rectangle = new Rectangle(3,5);
        Square square = new Square(5);

        double circleArea = circle.area();
        double circlePerimeter = circle.perimeter();

        double rectangleArea = rectangle.area();
        double rectanglePerimeter = rectangle.perimeter();

        double squareArea = square.area();
        double squarePerimeter = square.perimeter();

        System.out.println("Circle: Area = "+circleArea+", Perimeter = "+circlePerimeter);
        System.out.println("Rectangle: Area = "+rectangleArea+", Perimeter = "+rectanglePerimeter);
        System.out.println("Square: Area = "+squareArea+", Perimeter = "+squarePerimeter);

    }

}
