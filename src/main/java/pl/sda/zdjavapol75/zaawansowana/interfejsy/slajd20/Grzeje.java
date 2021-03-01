package pl.sda.zdjavapol75.zaawansowana.interfejsy.slajd20;

public interface Grzeje {
    double pobierzTemp();
    void zwiekszTemp();

    default void wyswietlTemp() {

    }
}
