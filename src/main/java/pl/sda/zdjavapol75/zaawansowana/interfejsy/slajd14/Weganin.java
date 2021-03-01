package pl.sda.zdjavapol75.zaawansowana.interfejsy.slajd14;

public class Weganin implements Jedzacy {

    int iloscZjedzonychPosilkow = 0;
    int iloscGramowZjedzone = 0;

    @Override
    public String toString() {
        return "Weganin{" +
                "iloscZjedzonychPosilkow=" + iloscZjedzonychPosilkow +
                ", iloscGramowZjedzone=" + iloscGramowZjedzone +
                '}';
    }

    @Override
    public void jedz(Pokarm pokarm) {
        if (pokarm.typPokarmu == TypPokarmu.OWOCE) {
            System.out.println("Jem " + TypPokarmu.OWOCE);
            iloscZjedzonychPosilkow +=1;
            iloscGramowZjedzone +=pokarm.waga;
        }
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
