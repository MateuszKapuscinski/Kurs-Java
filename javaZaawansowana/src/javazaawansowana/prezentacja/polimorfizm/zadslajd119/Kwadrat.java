package javazaawansowana.prezentacja.polimorfizm.zadslajd119;

public class Kwadrat extends Figura {
    double bokA;

    public Kwadrat(double bokA) {
        this.bokA = bokA;
    }

    @Override
    public double obliczPole() {
        return Math.pow(bokA,2);
    }
}
