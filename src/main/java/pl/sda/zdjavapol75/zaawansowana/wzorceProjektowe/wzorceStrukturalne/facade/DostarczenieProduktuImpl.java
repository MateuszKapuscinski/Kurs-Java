package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceStrukturalne.facade;

public class DostarczenieProduktuImpl implements DostarczenieProduktu{
    @Override
    public void dostarcz(Produkt produkt) {
        System.out.println("Produkt: " + produkt +" został dostarczony");
    }
}
