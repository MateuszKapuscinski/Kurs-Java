package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceStrukturalne.composite;

import java.util.List;

public class KompozycjaKola implements Koło{
    private List<Koło> namalowaneKola;
    public KompozycjaKola(List<Koło> namalowaneKola) {
        this.namalowaneKola = namalowaneKola;
    }
    @Override
    public void draw() {
        for (Koło kolo : namalowaneKola){
            kolo.draw();
        }
    }
}
