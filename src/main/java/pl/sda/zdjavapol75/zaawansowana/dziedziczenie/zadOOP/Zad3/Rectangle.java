package pl.sda.zdjavapol75.zaawansowana.dziedziczenie.zadOOP.Zad3;

public class Rectangle extends Shape {
    private double width;
    private double length;


    public Rectangle(String color, boolean isFilled, double width, double length) {
        super(color, isFilled);
        this.width = width;
        this.length = length;
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

    @Override
    public double getArea () {
        return (width * length);
    }

    @Override
    public double getPerimeter () {
        return (2 * width + 2 * length);
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + super.toString();
    }
}
