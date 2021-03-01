package pl.sda.zdjavapol75.zaawansowana.dziedziczenie.zadOOP.Zad3;

public class Circle extends Shape {
    private double radius;


    public Circle(String color, boolean isFilled, double radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    double getPerimeter () {
        return  (2 *Math.PI * radius) ;
    }

    @Override
    public String toString() {
        return "Circle with radius= " + radius + "which is a subclass off " + super.toString();
    }
}
