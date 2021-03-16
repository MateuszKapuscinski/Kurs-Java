package pl.sda.zdjavapol75.zaawansowana.programowanieZadania.zadWesele;

public class Zaproszenie {
    private String imie;
    private String nazwisko;
    typZaproszenia typZaproszenia;

    public Zaproszenie(String imie, String nazwisko, pl.sda.zdjavapol75.zaawansowana.programowanieZadania.zadWesele.typZaproszenia typZaproszenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.typZaproszenia = typZaproszenia;
    }

    @Override
    public String toString() {
        if (typZaproszenia == pl.sda.zdjavapol75.zaawansowana.programowanieZadania.zadWesele.typZaproszenia.POJEDYNCZE) {
            return "\n" + "Gość " + imie + " " + nazwisko + "\n" +
                     "Zaproszenie pojedyncze";
        }else {
            return "\n" + "Gość " + imie + " " + nazwisko + "\n" +
                    "Zaproszenie z osobą towarzyszącą";
        }
    }
}
