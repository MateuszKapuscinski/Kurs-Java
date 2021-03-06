package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceBehawioralne.command;

import pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceBehawioralne.chainOfResponsibility.Produkt;

public interface PrzyciskKoszyka {
    void dodaj(Produkt produkt);
    void usun(Produkt produkt);
}
