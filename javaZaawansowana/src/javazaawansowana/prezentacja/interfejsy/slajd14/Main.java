package javazaawansowana.prezentacja.interfejsy.slajd14;

public class Main {
    public static void main(String[] args) {
        Weganin weganin = new Weganin();
        Krokodyl krokodyl = new Krokodyl();
        Programista programista = new Programista();

        Jedzacy[] istotyJedzace = new Jedzacy[]{weganin, krokodyl, programista};

        for (int i = 0; i < istotyJedzace.length; i++) {
            istotyJedzace[i].jedz(new Pokarm("Salatka", TypPokarmu.OWOCE, 10));
        }

        int maxPosilkow = 0;
        int indeksMaxPosilkow = 0;
        for (int i = 0; i < istotyJedzace.length; i++) {
            if (istotyJedzace[i].ileGramowZjedzone() > maxPosilkow) {
                maxPosilkow = istotyJedzace[i].ilePosilkowZjedzone();
                indeksMaxPosilkow = i;
            }
        }
        System.out.println("Najwiecej posilkow zjadl: " + istotyJedzace[indeksMaxPosilkow]);


        int maxGramow = 0;
        int indeksMaxGramow = 0;
        for (int i = 0; i < istotyJedzace.length; i++) {
            if (istotyJedzace[i].ileGramowZjedzone() > maxGramow) {
                maxGramow = istotyJedzace[i].ileGramowZjedzone();
                indeksMaxGramow = i;
            }
        }
        System.out.println("Najwiecej posilkow zjadl: " + istotyJedzace[indeksMaxGramow]);
    }
}
