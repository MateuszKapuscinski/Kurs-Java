package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceBehawioralne.chainOfResponsibility;

public class MagazynWlochy implements MagazynHandler {


    @Override
    public boolean sprawdzDostępnośćProduktu(Produkt produkt) {
        switch (produkt) {
            case NOWY_TABLET:
            case TABLET:
                System.out.println("Produkt " + produkt + " jest dostepny we Wloszech");
                return Boolean.TRUE;
            default:
                System.out.println("Produkt " + produkt + " jest niedostepny we Wloszech");
                return Boolean.FALSE;
        }
    }

}
