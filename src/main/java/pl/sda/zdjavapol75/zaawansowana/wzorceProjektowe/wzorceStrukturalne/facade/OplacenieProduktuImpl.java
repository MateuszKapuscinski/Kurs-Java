package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceStrukturalne.facade;

public class OplacenieProduktuImpl implements OpłacenieProduktu{
    @Override
    public boolean oplacProdukt(double cena) {
        System.out.println("Produkt został opłacony w cenie: " + cena);
        return true;
    }
}
