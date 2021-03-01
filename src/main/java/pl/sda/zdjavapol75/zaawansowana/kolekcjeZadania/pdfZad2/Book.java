package pl.sda.zdjavapol75.zaawansowana.kolekcjeZadania.pdfZad2;

import java.util.List;
import java.util.Objects;

public class Book implements Comparable<Book> {
    private String tytul;
    private Double cena;
    private int rokWydania;
    private List<Author> listaAutorow;
    private Gatunek gatunek;

    public Book(String tytul, Double cena, int rokWydania, List<Author> listaAutorow, Gatunek gatunek) {
        this.tytul = tytul;
        this.cena = cena;
        this.rokWydania = rokWydania;
        this.listaAutorow = listaAutorow;
        this.gatunek = gatunek;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public Double getCena() {
        return cena;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }

    public List<Author> getListaAutorow() {
        return listaAutorow;
    }

    public void setListaAutorow(List<Author> listaAutorow) {
        this.listaAutorow = listaAutorow;
    }

    public Gatunek getGatunek() {
        return gatunek;
    }

    public void setGatunek(Gatunek gatunek) {
        this.gatunek = gatunek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(tytul, book.tytul) &&
                Double.compare(cena, book.cena) == 0 &&
                rokWydania == book.rokWydania &&
                Objects.equals(listaAutorow, book.listaAutorow) &&
                gatunek == book.gatunek;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tytul, cena, rokWydania, listaAutorow, gatunek);
    }

    @Override
    public String toString() {
        return "Book{" +
                "tytul='" + tytul + '\'' +
                ", cena='" + cena + '\'' +
                ", rokWydania='" + rokWydania + '\'' +
                ", listaAutorow=" + listaAutorow +
                ", gatunek=" + gatunek +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return o.getTytul().compareTo(tytul);
    }
}
