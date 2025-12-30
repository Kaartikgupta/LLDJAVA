package main.java.com.lld.shape;

public class ShapeApp {
    public static void main(String[] args) {
        Shapes circle = new Circle(5);
        Shapes rectangle = new Rectangle(4, 6);

        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}
