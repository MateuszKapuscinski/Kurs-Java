package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceBehawioralne.command;

import pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceBehawioralne.chainOfResponsibility.Produkt;

import java.util.HashSet;
import java.util.Set;

public class KoszykProduktów implements PrzyciskKoszyka {
    private Set<Produkt> koszyk =  new HashSet<>();
    @Override
    public void dodaj(Produkt produkt) {
        koszyk.add(produkt);
    }
    @Override
    public void usun(Produkt produkt) {
        koszyk.remove(produkt);
    }
    public Set<Produkt> getKoszyk() {
        System.out.println("Nasz koszyk produktów to: ");
        return koszyk;
    }
    @Override
    public String toString() {
        return "KoszykProduktów{" +
                "koszyk=" + koszyk +
                '}';
    }
}
