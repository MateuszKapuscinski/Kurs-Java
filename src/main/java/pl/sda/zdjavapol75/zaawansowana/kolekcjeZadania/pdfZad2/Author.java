package pl.sda.zdjavapol75.zaawansowana.kolekcjeZadania.pdfZad2;

import java.util.Objects;

public class Author {
    private String imie;
    private String nazwisko;
    private String plec;

    public Author(String imie, String nazwisko, String plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(imie, author.imie) &&
                Objects.equals(nazwisko, author.nazwisko) &&
                Objects.equals(plec, author.plec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, plec);
    }

    @Override
    public String toString() {
        return "Author{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", plec='" + plec + '\'' +
                '}';
    }
}

enum Gatunek {
    FANTASY, DOKUMENT, KRYMINALNE, DLA_DZIECI, FABULARNE
}