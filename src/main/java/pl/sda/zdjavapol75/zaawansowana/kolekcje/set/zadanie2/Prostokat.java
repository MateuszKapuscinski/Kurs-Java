package pl.sda.zdjavapol75.zaawansowana.kolekcje.set.zadanie2;

public class Prostokat extends Figura {
    private double bokA,bokB;

    public Prostokat(double bokA, double bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    @Override
    Double obliczPole() {
        return bokA * bokB;
    }


    @Override
    public String toString() {
        return "Pole prostokatu to: " + obliczPole();
    }
}
