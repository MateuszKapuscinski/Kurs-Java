package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceKonstrukcyjne.factory.zadBurgery;

import java.util.Arrays;

public class Subway implements Restauracja {

    public Burger zamów(BurgerTyp burgerTyp) {
        switch (burgerTyp){
            case KANAPKA:
                return new Burger.Builder()
                        .withCena(13.0)
                        .withWaga(Waga.G_300)
                        .withSkladniki(Arrays.asList(Skladniki.KURCZAK,Skladniki.CEBULA, Skladniki.BULKA, Skladniki.OGOREK, Skladniki.SER,Skladniki.SOS_MAJONEZOWY))
                        .withNameTyp(burgerTyp)
                        .stwórz();
            case KANAPKA_DLUGA:
                return new Burger.Builder()
                        .withCena(15.50)
                        .withWaga(Waga.G_300)
                        .withSkladniki(Arrays.asList(Skladniki.BULKA,Skladniki.PODWÓJNA_WOŁOWINA,Skladniki.OGOREK,Skladniki.SALATE,Skladniki.SOS_LAGODNY,Skladniki.POMIDOR))
                        .withNameTyp(burgerTyp)
                        .stwórz();
            default:
                System.out.println("Nie serwujemy takiego burgera");
                throw new RuntimeException();
        }
    }
}
