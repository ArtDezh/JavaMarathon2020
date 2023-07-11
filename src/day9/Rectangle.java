package day9;

public class Rectangle extends Figure {
    private double width;
    private double highe;

    public Rectangle(double width, double highe, String color) {
        super(color);
        this.width = width;
        this.highe = highe;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHighe() {
        return highe;
    }

    public void setHighe(double highe) {
        this.highe = highe;
    }

    @Override
    public double area() {
        return getHighe() * getWidth();
    }

    @Override
    public double perimeter() {
        return 2 * (width + highe);
    }
}
