package pl.sda.zdjavapol75.zaawansowana.polimorfizm.zadSlajd126;

public class Autor extends Czlowiek {

    private String gatunek;

    public Autor(String imie, String nazwisko, String gatunek) {
        super(imie, nazwisko);
        this.gatunek = gatunek;
    }
}
