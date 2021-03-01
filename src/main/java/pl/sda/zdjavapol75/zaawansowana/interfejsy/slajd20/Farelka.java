package pl.sda.zdjavapol75.zaawansowana.interfejsy.slajd20;

public class Farelka implements Grzeje {
    @Override
    public double pobierzTemp() {
        double pobranie = 15;
        return pobranie;
    }

    @Override
    public void zwiekszTemp() {
        
        wyswietlTemp();
    }

    public void wyswietlTemp() {
        System.out.println("Aktualna temperatura to: " + pobierzTemp());
    }

}
