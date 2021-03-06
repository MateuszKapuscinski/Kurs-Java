package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceStrukturalne.facade;

public class ZamówienieProduktuFasada {
    private SprawdzenieDostepnosciProduktu sprawdzenieDostepnosciProduktu;
    private OpłacenieProduktu opłacenieProduktu;
    private DostarczenieProduktu dostarczenieProduktu;
    public ZamówienieProduktuFasada(SprawdzenieDostepnosciProduktu sprawdzenieDostepnosciProduktu, OpłacenieProduktu opłacenieProduktu, DostarczenieProduktu dostarczenieProduktu) {
        this.sprawdzenieDostepnosciProduktu = sprawdzenieDostepnosciProduktu;
        this.opłacenieProduktu = opłacenieProduktu;
        this.dostarczenieProduktu = dostarczenieProduktu;
    }
    public void zamówienie(Produkt produkt){
        if (sprawdzenieDostepnosciProduktu.czyJestDostepny(produkt)){
            if(opłacenieProduktu.oplacProdukt(1500)){
                dostarczenieProduktu.dostarcz(produkt);
            }
        }
    }
}
