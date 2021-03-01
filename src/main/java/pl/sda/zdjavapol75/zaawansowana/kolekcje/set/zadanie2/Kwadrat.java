package pl.sda.zdjavapol75.zaawansowana.kolekcje.set.zadanie2;

public class Kwadrat extends Figura {
    private double bokA;

    public Kwadrat(double bokA) {
        this.bokA = bokA;
    }

    @Override
    Double obliczPole() {
        return bokA * bokA;
    }


    @Override
    public String toString() {
        return "Pole kwadratu to: " + obliczPole();
    }
}
