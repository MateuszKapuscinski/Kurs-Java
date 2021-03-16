package pl.sda.zdjavapol75.zaawansowana.programowanieZadania.zadWesele;

public enum typZaproszenia {
    POJEDYNCZE(1),
    Z_OS_TOWARZYSZACO(2);

    private int ileOsob;

    typZaproszenia(int ileOsob) {
        this.ileOsob = ileOsob;
    }

    public int getIleOsob() {
        return ileOsob;
    }
}
