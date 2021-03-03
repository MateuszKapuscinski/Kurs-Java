package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceKonstrukcyjne.factory.zadBurgery;

import java.util.Arrays;

public class McDonald implements Restauracja {
    public Burger zamów(BurgerTyp burgerTyp){
        switch(burgerTyp){
            case BIG_MAC:
                return new Burger.Builder()
                        .withCena(17.0)
                        .withWaga(Waga.G_300)
                        .withSkladniki(Arrays.asList(Skladniki.WOLOWINA,Skladniki.CEBULA, Skladniki.BULKA, Skladniki.OGOREK, Skladniki.SER, Skladniki.SALATE,Skladniki.SOS_MAJONEZOWY))
                        .withNameTyp(BurgerTyp.BIG_MAC)
                        .stwórz();
            case MC_ROYAL:
                return new Burger.Builder()
                        .withCena(8.0)
                        .withWaga(Waga.G_500)
                        .withSkladniki(Arrays.asList(Skladniki.PODWÓJNA_WOŁOWINA,Skladniki.CEBULA, Skladniki.BULKA, Skladniki.OGOREK, Skladniki.SER, Skladniki.SALATE,Skladniki.SOS_ARABSKI))
                        .withNameTyp(BurgerTyp.MC_ROYAL)
                        .stwórz();
            case CHEESE_BURGER:
                return new Burger.Builder()
                        .withCena(4.00)
                        .withWaga(Waga.G_300)
                        .withSkladniki(Arrays.asList(Skladniki.BULKA,Skladniki.WOLOWINA,Skladniki.OGOREK,Skladniki.SOS_MAJONEZOWY,Skladniki.SER))
                        .withNameTyp(BurgerTyp.CHEESE_BURGER)
                        .stwórz();
            case CHICKEN_BURGER:
                return new Burger.Builder()
                        .withCena(6.50)
                        .withWaga(Waga.G_300)
                        .withSkladniki(Arrays.asList(Skladniki.BULKA,Skladniki.KURCZAK,Skladniki.OGOREK,Skladniki.SALATE,Skladniki.SOS_LAGODNY))
                        .withNameTyp(BurgerTyp.CHICKEN_BURGER)
                        .stwórz();
            case WIES_MAC:
                return new Burger.Builder()
                        .withCena(12.00)
                        .withWaga(Waga.G_1000)
                        .withSkladniki(Arrays.asList(Skladniki.BULKA,Skladniki.PODWÓJNA_WOŁOWINA,Skladniki.SALATE,Skladniki.OGOREK,Skladniki.PODWÓJNY_SER,Skladniki.POMIDOR,Skladniki.SOS_ARABSKI))
                        .withNameTyp(BurgerTyp.WIES_MAC)
                        .stwórz();
            default:
                System.out.println("Nie serwujemy takiego burgera");
                throw new RuntimeException();
        }
    }
}
