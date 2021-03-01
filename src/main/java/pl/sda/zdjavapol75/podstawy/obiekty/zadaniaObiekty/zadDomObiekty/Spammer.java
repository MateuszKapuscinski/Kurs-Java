package pl.sda.zdjavapol75.podstawy.obiekty.zadaniaObiekty.zadDomObiekty;

import java.util.Scanner;

public class Spammer {
    String slowo;
    int iloscPowtorzen;

    public void wyswietlSlowa() {
        System.out.println("Podaj slowo jakie mam wyswietlac");
        Scanner scanner = new Scanner(System.in);
        this.slowo = slowo;
        slowo = scanner.next();
        System.out.println("Podaj ile razy mam je wyswietlic");
        this.iloscPowtorzen = iloscPowtorzen;
        this.iloscPowtorzen = scanner.nextInt();

    }

    public void obliczenie() {
        for (int i = 0; i < iloscPowtorzen; i++) {
            System.out.println(slowo);
        }
    }
}
