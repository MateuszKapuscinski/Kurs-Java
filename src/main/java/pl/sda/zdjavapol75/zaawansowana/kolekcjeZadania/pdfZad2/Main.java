package pl.sda.zdjavapol75.zaawansowana.kolekcjeZadania.pdfZad2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Author autor1 = new Author("Maria","Konopnicka","kobieta");
        Author autor2 = new Author("Adam","Mickiewicz","mezczyzna");
        Author autor3 = new Author("Juliusz","Slowacki","mezczyzna");
        Author autor4 = new Author("Zygmunt","Krasinski","mezczyzna");

        Book ksiazka1 = new Book("ksiazeczki",33.50,2010, Arrays.asList(autor1,autor3),Gatunek.DLA_DZIECI);
        Book ksiazka2 = new Book("Opowiadania",22.20,1995,Arrays.asList(autor2),Gatunek.FABULARNE);
        Book ksiazka3  = new Book("Zbior Ksiag",55.70,2007,Arrays.asList(autor2,autor3,autor4),Gatunek.KRYMINALNE);

        BookService bookService = new BookService();
        bookService.dodawanieKsiazekDoListy(ksiazka1);
        bookService.dodawanieKsiazekDoListy(ksiazka2);
        bookService.dodawanieKsiazekDoListy(ksiazka3);

        System.out.println(bookService.zwracaListeKsiazekTegoSamegoAutora(autor2));
        System.out.println(bookService.wypisanieListyKsiazek());
        System.out.println(bookService.zwracanieNajdrozszejKsiazki());
        System.out.println(bookService.posortowaneKsiazkiRoscnaco());
        System.out.println(bookService.posortowaneKsiazkiMalejaco());

        //zad 4
        System.out.println(bookService.zwracanieUnikalnychPar());

    }
}
