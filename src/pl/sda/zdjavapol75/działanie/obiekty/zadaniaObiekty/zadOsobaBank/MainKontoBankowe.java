package pl.sda.zdjavapol75.działanie.obiekty.zadaniaObiekty.zadOsobaBank;

import pl.sda.zdjavapol75.działanie.obiekty.zadaniaObiekty.zadOsobaBank.KontoBankowe;

public class MainKontoBankowe {
    public static void main(String[] args) {
        KontoBankowe Andrzej = new KontoBankowe(123L,1000);
        KontoBankowe Beata = new KontoBankowe(555L,2000);

        Andrzej.wyswietlStanKonta();
        Beata.wyswietlStanKonta();

        Beata.wplacSrodki(Andrzej.pobierzSrodki(1000));

        Andrzej.wyswietlStanKonta();
        Beata.wyswietlStanKonta();
    }
}
