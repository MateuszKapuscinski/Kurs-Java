package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceStrukturalne.facade;

public class SprawdzDostepnoscProduktuImpl implements SprawdzenieDostepnosciProduktu{
    @Override
    public boolean czyJestDostepny(Produkt produkt) {
        System.out.println("Produkt: " + produkt + " jest dostępny ");
        return true;
    }
}
