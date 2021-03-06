package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceBehawioralne.command;

import pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceBehawioralne.chainOfResponsibility.Produkt;

public class CommandUzycie {
    public static void main(String[] args) {
        KoszykProduktów koszykProduktów =  new KoszykProduktów();
        SpecjalnyKoszykProduktów specjalnyKoszyk = new SpecjalnyKoszykProduktów();
        koszykProduktów.dodaj(Produkt.IPHONE);
        koszykProduktów.dodaj(Produkt.TABLET);
//        System.out.println(koszykProduktów.getKoszyk());
        koszykProduktów.usun(Produkt.IPHONE);
//        System.out.println(koszykProduktów.getKoszyk());
        specjalnyKoszyk.dodaj(Produkt.LAPTOP_GAMINOWY);
        System.out.println(specjalnyKoszyk.getKoszyk());
    }
}
