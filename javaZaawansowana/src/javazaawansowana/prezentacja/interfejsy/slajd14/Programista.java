package javazaawansowana.prezentacja.interfejsy.slajd14;

public class Programista implements Jedzacy {
    int iloscZjedzonychPosilkow = 0;
    int iloscGramowZjedzone = 0;

    @Override
    public String toString() {
        return "Programista{" +
                "iloscZjedzonychPosilkow=" + iloscZjedzonychPosilkow +
                ", iloscGramowZjedzone=" + iloscGramowZjedzone +
                '}';
    }

    @Override
    public void jedz(Pokarm pokarm) {
            System.out.println("Programista je  " + TypPokarmu.OWOCE + ", " +  TypPokarmu.NABIAL + ", " + TypPokarmu.MIESO);
            iloscZjedzonychPosilkow +=1;
            iloscGramowZjedzone +=pokarm.waga;

    }

    @Override
    public int ilePosilkowZjedzone() {
        return iloscZjedzonychPosilkow;
    }

    @Override
    public int ileGramowZjedzone() {
        return iloscGramowZjedzone;
    }
}
