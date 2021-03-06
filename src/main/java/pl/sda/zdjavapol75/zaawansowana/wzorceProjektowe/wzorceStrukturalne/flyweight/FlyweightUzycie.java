package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceStrukturalne.flyweight;

public class FlyweightUzycie {
    public static void main(String[] args) {
       Car car = CarFactory.stwórzSamochód("Nowy","opel","czarny");
        System.out.println(car);
    }
}
