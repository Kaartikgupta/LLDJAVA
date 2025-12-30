package main.java.com.lld.shape;

public class Rectangle implements Shapes {
    private final int length;
    private final int breadth;
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public double calculateArea() {
        return length * breadth;
    }
}
