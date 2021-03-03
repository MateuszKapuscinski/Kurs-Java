package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceKonstrukcyjne.factory.zadBurgery;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Burger> zamówioneBurgery = new ArrayList<>();

    public static void main(String[] args) {
/*        McDonald mcDonald = new McDonald();
        zamówioneBurgery.add(mcDonald.zamów(BurgerTyp.BIG_MAC));
        zamówioneBurgery.add(mcDonald.zamów(BurgerTyp.MC_ROYAL));
        zamówioneBurgery.add(mcDonald.zamów(BurgerTyp.CHEESE_BURGER));
        zamówioneBurgery.add(mcDonald.zamów(BurgerTyp.CHICKEN_BURGER));
        zamówioneBurgery.add(mcDonald.zamów(BurgerTyp.WIES_MAC));
        wyświetlZamówienie();

        KFC kfc = new KFC();
        zamówioneBurgery.add(kfc.zamów(BurgerTyp.GRANDER));
        zamówioneBurgery.add(kfc.zamów(BurgerTyp.ZINGER));
        wyświetlZamówienie();
    }
    private static void wyświetlZamówienie(){
        for(Burger burger : zamówioneBurgery){
            System.out.println(burger);
        }
    */

        /*Restauracja wybranaResuracja = RestauracjaFactory.wybierzRestauracje(TypRestauracji.Kfc);
        zamówioneBurgery.add(wybranaResuracja.zamów(BurgerTyp.ZINGER));
        zamówioneBurgery.add(wybranaResuracja.zamów(BurgerTyp.GRANDER));
        wyświetlZamówienie();*/

        Restauracja nowaRestauracja = RestauracjaFactory.wybierzRestauracje(TypRestauracji.SUBWAY);
        zamówioneBurgery.add(nowaRestauracja.zamów(BurgerTyp.KANAPKA));
        wyświetlZamówienie();
    }

    private static void wyświetlZamówienie() {
        for (Burger burger : zamówioneBurgery) {
            System.out.println(burger);
        }
    }
}
