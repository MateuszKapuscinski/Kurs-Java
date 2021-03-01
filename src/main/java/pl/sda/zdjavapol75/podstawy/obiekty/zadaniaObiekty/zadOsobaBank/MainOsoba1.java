package pl.sda.zdjavapol75.podstawy.obiekty.zadaniaObiekty.zadOsobaBank;

public class MainOsoba1 {
    public static void main(String[] args) {

        Osoba1 ania = new Osoba1();
        ania.imie = "Ania";
        ania.rokUrodzenia = 1996;
        ania.przedstawSie();

        Osoba1 Andrzej = new Osoba1();
        Andrzej.imie = "Andrzej";
        Andrzej.rokUrodzenia = 1967;
        Andrzej.przedstawSie();

        Osoba1 Mariola = new Osoba1();
        Mariola.imie = "Mariola";
        Mariola.rokUrodzenia = 1953;
        Mariola.przedstawSie();
    }
}
