package pl.sda.zdjavapol75.zaawansowana.dziedziczenie.zadOOP.Zad3;

public class Square extends Rectangle {

    public Square(String color, boolean isFilled, double width, double length) {
        super(color, isFilled, width, length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return String.format("Square with width = f and length= which is subclass off " , getWidth() + getLength(), super.toString());
    }
}
