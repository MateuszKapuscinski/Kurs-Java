package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceStrukturalne.composite;

import java.util.Arrays;

public class KompozycjaUzycie {
    public static void main(String[] args) {
/*        Koło duzeKolo = new DuzeKolo();
        Koło maleKolo = new MałeKolo();
        Koło owalneKolo = new OwalneKolo();
        KompozycjaKola kompozycjaKola = new KompozycjaKola(Arrays.asList(duzeKolo, maleKolo, owalneKolo));
        kompozycjaKola.draw();*/

        Kwadrat czerwony = new CzerwonyKwadrat();
        Kwadrat zielony = new ZielonyKwadrat();
        KompozycjaKwadratu kompozycjaKwadratu = new KompozycjaKwadratu(Arrays.asList(czerwony,zielony));
        kompozycjaKwadratu.draw();
    }
}
