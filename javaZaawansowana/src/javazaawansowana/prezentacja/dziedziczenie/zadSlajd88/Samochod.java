package javazaawansowana.prezentacja.dziedziczenie.zadSlajd88;

import java.util.Objects;

public class Samochod {

    protected String kolor;
    protected String marka;
    protected int rocznik;
    protected double predkosc;
    private boolean swiatla;

    public void przyspiesz() {
        if (predkosc < 120) {
            this.predkosc += 10;
            System.out.println("Przyspieszam do " + predkosc + " km/h");
        } else {
            System.out.println("Jedziesz za szybko");
        }
    }

    public void przelaczSwiatla() {
        swiatla = !swiatla;
        System.out.println("Wlaczam");
    }

    protected boolean czySwiatlaWlaczone() {
        return swiatla;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Samochod samochod = (Samochod) o;
        return rocznik == samochod.rocznik &&
                Objects.equals(kolor, samochod.kolor) &&
                Objects.equals(marka, samochod.marka);
    }

    public Samochod(String kolor, String marka, int rocznik,boolean swiatla, double predkosc) {
        this.kolor = kolor;
        this.marka = marka;
        this.rocznik = rocznik;
        this.swiatla = swiatla;
        this.predkosc = predkosc;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "kolor='" + kolor + '\'' +
                ", marka='" + marka + '\'' +
                ", rocznik=" + rocznik +
                ", predkosc=" + predkosc +
                ", swiatla=" + swiatla +
                '}';
    }
}
