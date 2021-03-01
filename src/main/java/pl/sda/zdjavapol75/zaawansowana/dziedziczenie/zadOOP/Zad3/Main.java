package pl.sda.zdjavapol75.zaawansowana.dziedziczenie.zadOOP.Zad3;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle("blue", true, 30),
                new Rectangle("yellow", true, 20,30),
                new Square("green", false, 40,20)
        };
        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println(shape.getArea());
            System.out.println(shape.getPerimeter());
        }
    }
}
