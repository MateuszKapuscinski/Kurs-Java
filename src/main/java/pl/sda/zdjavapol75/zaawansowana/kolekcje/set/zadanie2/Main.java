package pl.sda.zdjavapol75.zaawansowana.kolekcje.set.zadanie2;


import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Kwadrat kwadrat = new Kwadrat(2);
        Kwadrat kwadrat2 = new Kwadrat(5);
        Prostokat prostokat = new Prostokat(2,5);
        Prostokat prostokat2 = new Prostokat(4,6);

        Set<Figura> kwadratSet = new TreeSet<>();
        kwadratSet.add(kwadrat);
        kwadratSet.add(kwadrat2);
        kwadratSet.add(prostokat);
        kwadratSet.add(prostokat2);
        System.out.println(kwadratSet);

    }
}
