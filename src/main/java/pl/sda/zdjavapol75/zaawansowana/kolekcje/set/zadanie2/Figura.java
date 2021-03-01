package pl.sda.zdjavapol75.zaawansowana.kolekcje.set.zadanie2;

public abstract class Figura implements Comparable<Figura> {
    abstract Double obliczPole();

    @Override
    public int compareTo(Figura figura) {
       return Double.compare(this.obliczPole(),figura.obliczPole());
    }

    @Override
    public String toString() {
        return "Figura{pole=" + obliczPole() + "}";
    }
}
