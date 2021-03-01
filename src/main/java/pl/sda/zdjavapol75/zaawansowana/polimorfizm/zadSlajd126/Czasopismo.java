package pl.sda.zdjavapol75.zaawansowana.polimorfizm.zadSlajd126;

public class Czasopismo extends Egzemplarz {
    private int numerWydania;

    public Czasopismo(Autor autor, String tytul, int numerWydania) {
        this.autor = autor;
        this.tytul = tytul;
        this.numerWydania = numerWydania;
    }
}
