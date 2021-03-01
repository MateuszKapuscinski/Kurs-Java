package pl.sda.zdjavapol75.podstawy.obiekty.zadaniaObiekty.zadOsobaBank;

public class Osoba1 {

    int rokUrodzenia;
    String imie;

    public void przedstawSie() {
        System.out.println("Cześć! Mam na imię " + this.imie + " i mam " + (2021 - this.rokUrodzenia) + " lat");

    }

}
