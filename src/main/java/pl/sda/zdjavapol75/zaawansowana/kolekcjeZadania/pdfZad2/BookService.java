package pl.sda.zdjavapol75.zaawansowana.kolekcjeZadania.pdfZad2;

import java.util.*;

public class BookService  {
    private List<Book> listaKsiazek = new ArrayList<>();

    public void dodawanieKsiazekDoListy(Book ksiazka) {
        listaKsiazek.add(ksiazka);
    }

    public void usuwanieKsiazekZListy (Book ksiazka) {
        listaKsiazek.remove(ksiazka);
    }

    public List<Book> wypisanieListyKsiazek() {
       return listaKsiazek;
    }

    public List<Book> zwracanieKsiazkiDanegoTypu(Gatunek gatunek) {
        List<Book> wynik = new ArrayList<>();
        for (Book ksiazki : listaKsiazek) {
            if (ksiazki.getGatunek() == gatunek) {
                wynik.add(ksiazki);
            }
        }
        return wynik;
    }

    public List<Book> zwracanieKsiazekWydanychPrzed1999r() {
        List<Book> wynik = new ArrayList<>();
        for (Book ksiazki : listaKsiazek) {
            if (ksiazki.getRokWydania() < 1999) {
                wynik.add(ksiazki);
            }
        }
        return wynik;
    }

    public Book zwracanieNajdrozszejKsiazki () {
        Book wynik = null;
        for (Book ksiazki:listaKsiazek){
            if (wynik == null || wynik.getCena() < ksiazki.getCena()) {
                wynik = ksiazki;
            }
        }
        return wynik;
    }
    public Book zwracanieNajtanszejKsiazki () {
        Book wynik = null;
        for (Book ksiazki:listaKsiazek){
            if (wynik == null || wynik.getCena() > ksiazki.getCena()) {
                wynik = ksiazki;
            }
        }
        return wynik;
    }

    public List<Book> zwracanieAutorowPoNumerze (int liczbaAutorow) {
        List<Book> wynik = new ArrayList<>();
        for (Book ksiazki : listaKsiazek) {
            if (ksiazki.getListaAutorow().size() == liczbaAutorow) {
                wynik.add(ksiazki);
            }
        }
        return wynik;
    }

    public List<Book> posortowaneKsiazkiRoscnaco () {
        Collections.sort(listaKsiazek);
        return listaKsiazek;
    }

    public List<Book> posortowaneKsiazkiMalejaco () {
        Collections.reverse(listaKsiazek);
        return listaKsiazek;
    }

    public boolean znajdowanieKsiazkiCzyJestNaLiscie (Book ksiazka) {
        return listaKsiazek.contains(ksiazka);
    }

    public List<Book> zwracaListeKsiazekTegoSamegoAutora (Author autor) {
        List<Book> wynik = new ArrayList<>();
        for (Book ksiazki : listaKsiazek) {
            if (ksiazki.getListaAutorow().contains(autor)) {
                wynik.add(ksiazki);
            }
        }
        return wynik;
    }

    public Map<Gatunek,String> zwracanieUnikalnychPar () {
        Map<Gatunek,String> mapaKsiazek = new HashMap<>();
        for (Book books: listaKsiazek) {
            mapaKsiazek.put(books.getGatunek(),books.getTytul());
        }
        return mapaKsiazek;
    }

}
