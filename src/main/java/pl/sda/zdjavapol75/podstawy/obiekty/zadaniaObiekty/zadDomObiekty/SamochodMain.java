package pl.sda.zdjavapol75.podstawy.obiekty.zadaniaObiekty.zadDomObiekty;

public class SamochodMain {
    public static void main(String[] args) {

        Samochod Opel = new Samochod("Opel", 80);
        Samochod Renault = new Samochod("Renault", 100);
        Samochod Fiat = new Samochod("Fiat", 60);

        Fiat.wypiszInformacjeOSamochodzie();
        Fiat.przyspieszO5km();
        Fiat.przyspieszO5km();
        Fiat.zwolnijO5km();

    }
}
