package pl.sda.zdjavapol75.podstawy.obiekty.zadaniaObiekty.zadDomObiekty;

public class RachunekBankowy {
    private  long numerKonta;
    private int iloscSrodkow;
    private String imieINazwiskoWlasciciela;

    long getNumerKonta() {
        return this.numerKonta;
    }
    int getIloscSrodkow() {
        return this.iloscSrodkow;
    }
    String getImieINazwiskoWlasciciela() {
        return this.imieINazwiskoWlasciciela;
    }
    public void wykonajPrzelewPrzychodzacy (double kwota) {
        kwota = kwota + this.iloscSrodkow;
    }
    public void wykonajPrzelewWychodzacy (double kwota) {
        kwota = kwota - this.iloscSrodkow;
    }
}
