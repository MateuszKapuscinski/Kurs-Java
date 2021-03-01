package pl.sda.zdjavapol75.zaawansowana.polimorfizm.zadSlajd126;

public abstract class Czlowiek {

    protected String imie;
    protected String nazwisko;

    public Czlowiek(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }
}
