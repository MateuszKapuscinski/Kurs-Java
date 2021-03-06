package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceStrukturalne.composite;

import java.util.List;

public class KompozycjaKwadratu implements Kwadrat{

    private List<Kwadrat> listaKwadratow;

    public KompozycjaKwadratu(List<Kwadrat> listaKwadratow) {
        this.listaKwadratow = listaKwadratow;
    }

    @Override
    public void draw() {
        for (Kwadrat kwadrat : listaKwadratow) {
            kwadrat.draw();
        }
    }
}
