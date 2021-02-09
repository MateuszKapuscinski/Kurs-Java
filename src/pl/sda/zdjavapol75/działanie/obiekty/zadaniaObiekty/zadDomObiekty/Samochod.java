package pl.sda.zdjavapol75.działanie.obiekty.zadaniaObiekty.zadDomObiekty;

public class Samochod {

    String nazwa;
    int predkosc;

    public void wypiszInformacjeOSamochodzie() {
        System.out.println("Nazwa samochodu to " + this.nazwa + " i osiaga predkosc " + this.predkosc + " km/h");
    }

    public void przyspieszO5km() {
        int przyspiesz = 5;
        this.predkosc = this.predkosc + 5;
        predkoscSamochodu();
    }

    public void zwolnijO5km() {
        this.predkosc = this.predkosc - 5;
        predkoscSamochodu();

    }

    public Samochod(String nazwa, int predkosc) {
        this.nazwa = nazwa;
        this.predkosc = predkosc;
    }

    public void predkoscSamochodu() {
        System.out.println("Predkosc samochodu to " + this.predkosc);
    }
}
