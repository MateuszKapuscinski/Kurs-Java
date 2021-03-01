package pl.sda.zdjavapol75.zaawansowana.interfejsy.slajd20;

public class Wiatrak implements Chlodzi {
    @Override
    public double pobierzTemp() {
        return 27;
    }

    @Override
    public void schlodz() {
        System.out.println("Temperatura po schlodzeniu wynosi: " + (pobierzTemp() - 1.0));
    }
}
