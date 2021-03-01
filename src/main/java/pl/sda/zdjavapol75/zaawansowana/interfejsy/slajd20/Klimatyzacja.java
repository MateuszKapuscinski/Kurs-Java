package pl.sda.zdjavapol75.zaawansowana.interfejsy.slajd20;

public class Klimatyzacja implements Grzeje,Chlodzi {

    @Override
    public void schlodz() {
        System.out.println("Temperatura po schlodzeniu wynosi: " + (pobierzTemp() - 1.0));
    }

     @Override
    public void wyswietlTemp() {

    }

    @Override
    public double pobierzTemp() {
        return 22.0;
    }

    @Override
    public void zwiekszTemp() {
        System.out.println("Temperatura po zwiekszeniu wynosi " + (pobierzTemp() + 1.0));
    }
}
