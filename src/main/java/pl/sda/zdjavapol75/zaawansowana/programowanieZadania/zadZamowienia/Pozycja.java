package pl.sda.zdjavapol75.zaawansowana.programowanieZadania.zadZamowienia;

public class Pozycja {
    private String nazwaTowaru;
    private int iloscSztuk;
    private double cenaSztuki;

    public double obliczWartosc(){
        return iloscSztuk * cenaSztuki;
    }

    @Override
    public String toString() {
        return "Pozycja{" +
                "nazwaTowaru='" + nazwaTowaru + '\'' +
                ", iloscSztuk=" + iloscSztuk +
                ", cenaSztuki=" + cenaSztuki +
                '}';
    }

    public Pozycja(String nazwaTowaru, int iloscSztuk, double cenaSztuki) {
        this.nazwaTowaru = nazwaTowaru;
        this.iloscSztuk = iloscSztuk;
        this.cenaSztuki = cenaSztuki;
    }

    public String getNazwaTowaru() {
        return nazwaTowaru;
    }

    public void setNazwaTowaru(String nazwaTowaru) {
        this.nazwaTowaru = nazwaTowaru;
    }

    public int getIloscSztuk() {
        return iloscSztuk;
    }

    public void setIloscSztuk(int iloscSztuk) {
        this.iloscSztuk = iloscSztuk;
    }

    public double getCenaSztuki() {
        return cenaSztuki;
    }

    public void setCenaSztuki(double cenaSztuki) {
        this.cenaSztuki = cenaSztuki;
    }
}
