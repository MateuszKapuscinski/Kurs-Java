package pl.sda.zdjavapol75.podstawy.obiekty.zadaniaObiekty.zadOsobaBank;

public class OsobaMain {
    public static void main(String[] args) {

        /*Osoba osoba2 = new Osoba("Andrzej", 1950, 'M');
        Osoba osoba3 = new Osoba("Kamila", 2000, 'K');
        Osoba osoba4 = new Osoba("Michal", 1990, 'M');

        int[] tablicaIntow = new int[3]; // tak robilismy tablice intow - int jest typem prostym
        String[] tablicaStringow = new String[3]; // tak robilismy tablice Stringow - String jest obiektem
        Osoba[] tablicaOsob = new Osoba[3]; // tak robimy tablice na obiekty typu Osoba
        tablicaOsob[0] = osoba2;
        tablicaOsob[1] = osoba3;
        tablicaOsob[2] = osoba4;
        System.out.println("Przedstawmy panów");
        for (int i = 0; i < tablicaOsob.length; i++) {
            if (tablicaOsob[i].plec == 'M')
            tablicaOsob[i].przedstawSie();
        }
        System.out.println("Przedstawmy panie");
        for (int i = 0; i < tablicaOsob.length; i++) {
            if (tablicaOsob[i].plec == 'K')
            tablicaOsob[i].przedstawSie();
        }*/


    KontoBankowe Andrzej = new KontoBankowe(123L,1000);
    KontoBankowe Beata = new KontoBankowe(555L,2000);

    Andrzej.wyswietlStanKonta();
    Beata.wyswietlStanKonta();

    Beata.wplacSrodki(Andrzej.pobierzSrodki(1000));

    Andrzej.wyswietlStanKonta();
    Beata.wyswietlStanKonta();



    }
}
