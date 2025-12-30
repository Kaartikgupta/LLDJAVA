package main.java.com.lld.shape;

public class Circle implements Shapes {
    private final int radius;
    public Circle(int radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

}
