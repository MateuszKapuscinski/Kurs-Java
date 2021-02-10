package javazaawansowana.prezentacja.dziedziczenie.zadSlajd97;

public class Kolo {
    protected double promien;
    protected final double liczbaPI = 3.14;

    public Kolo(double promien) {
        this.promien = promien;
    }

    public final double obliczPole() {
        return liczbaPI * promien * promien;
    }

    public final double obliczPole(double PI) {
        return PI * promien * promien;
    }
}
