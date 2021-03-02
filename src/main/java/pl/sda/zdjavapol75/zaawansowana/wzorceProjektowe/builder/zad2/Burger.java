package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.builder.zad2;

import java.util.List;

public class Burger {
    private List<String> skladniki;
    private String  waga;
    private double cena;

    private Burger(List<String> skladniki, String waga, double cena) {
        this.skladniki = skladniki;
        this.waga = waga;
        this.cena = cena;
    }

    public List<String> getSkladniki() {
        return skladniki;
    }

    public String getWaga() {
        return waga;
    }

    public double getCena() {
        return cena;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "skladniki=" + skladniki +
                ", waga='" + waga + '\'' +
                ", cena=" + cena +
                '}';
    }

    public static class Builder {
        private List<String> skladniki;
        private String  waga;
        private double cena;

        public Burger.Builder listaSkladnikow(final List<String>skladniki) {
            this.skladniki = skladniki;
            return this;
        }

        public Burger.Builder jakaWaga(final String waga) {
            this.waga = waga;
            return this;
        }

        public Burger.Builder jakaCena (final double cena) {
            this.cena = cena;
            return this;
        }

        public Burger burger () {
            return new Burger (skladniki,waga,cena);
        }

    }
}
