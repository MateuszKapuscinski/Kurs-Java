package javazaawansowana.prezentacja.polimorfizm.zadSlajd126;

public class Ksiazka extends Egzemplarz {
    private String gatunek;

    public Ksiazka(Autor autor, String tytul, String gatunek) {
        this.autor = autor;
        this.tytul = tytul;
        this.gatunek = gatunek;
    }
}
