package day9.Task2;

public class Rectangle extends Figure {
    private int width;
    private int high;

    public Rectangle(int width, int high, String color) {
        super(color);
        this.width = width;
        this.high = high;
    }
    @Override
    public double area() {
        return width * high;
    }

    @Override
    public double perimeter() {
        return 2 * (width + high);
    }

}
