package pl.sda.zdjavapol75.zaawansowana.typyGeneryczneZadania.zad1;

public class Pair<K, V> {
    private K klucz;
    private V wartosc;

    public Pair(K klucz, V wartosc) {
        this.klucz = klucz;
        this.wartosc = wartosc;
    }

    public K getKlucz() {
        return klucz;
    }

    public void setKlucz(K klucz) {
        this.klucz = klucz;
    }

    public V getWartosc() {
        return wartosc;
    }

    public void setWartosc(V wartosc) {
        this.wartosc = wartosc;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "klucz=" + klucz +
                ", wartosc=" + wartosc +
                '}';
    }

}
