package pl.sda.zdjavapol75.zaawansowana.interfejsy.slajd14;

public class Krokodyl implements Jedzacy {
    int iloscZjedzonychPosilkow = 0;
    int iloscGramowZjedzone = 0;

    @Override
    public String toString() {
        return "Krokodyl{" +
                "iloscZjedzonychPosilkow=" + iloscZjedzonychPosilkow +
                ", iloscGramowZjedzone=" + iloscGramowZjedzone +
                '}';
    }

    @Override
    public void jedz(Pokarm pokarm) {
        System.out.println("Jem " + TypPokarmu.MIESO + TypPokarmu.NABIAL);
    }

    @Override
    public int ilePosilkowZjedzone() {
        return 5;
    }

    @Override
    public int ileGramowZjedzone() {
        return 4000;
    }
}
