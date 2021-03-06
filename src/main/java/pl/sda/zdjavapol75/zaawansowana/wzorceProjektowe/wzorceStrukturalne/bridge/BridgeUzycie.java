package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceStrukturalne.bridge;

import java.util.Arrays;

public class BridgeUzycie {
    public static void main(String[] args) {
 /*   HerbataZakup herbataZakup = new HerbataZakup();
    KawaZakup kawaZakup =  new KawaZakup();
    PiwoZakup piwoZakup =  new PiwoZakup();
    Pub pub = new Pub(herbataZakup);
    pub.wyświetlZakupyKlienta(Arrays.asList(Dodatki.CYTRYNA, Dodatki.MIOD, Dodatki.MLEKO));
*/
        PiwoZakup piwoZakup = new PiwoZakup();
        Drink piwoZakup2 = piwoZakup.kup(Arrays.asList(Dodatki.Z_SOKIEM));
        System.out.println(piwoZakup2.nazwa() + piwoZakup2.cena());

    }
}
