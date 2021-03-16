package pl.sda.zdjavapol75.zaawansowana.funkcyjne.Zad.sklepInternetowy;

public class Komputer {
    private String nazwaFirmyProcesora;
    private int generacjaProcesora;
    private int iloscRamuKartyGraficznej;
    private int iloscRamu;
    private int mocZasilacza;
    private int cena;

    public Komputer(String nazwaFirmyProcesora, int generacjaProcesora, int iloscRamuKartyGraficznej, int iloscRamu, int mocZasilacza, int cena) {
        this.nazwaFirmyProcesora = nazwaFirmyProcesora;
        this.generacjaProcesora = generacjaProcesora;
        this.iloscRamuKartyGraficznej = iloscRamuKartyGraficznej;
        this.iloscRamu = iloscRamu;
        this.mocZasilacza = mocZasilacza;
        this.cena = cena;
    }

    public String getNazwaFirmyProcesora() {
        return nazwaFirmyProcesora;
    }

    public void setNazwaFirmyProcesora(String nazwaFirmyProcesora) {
        this.nazwaFirmyProcesora = nazwaFirmyProcesora;
    }

    public int getGeneracjaProcesora() {
        return generacjaProcesora;
    }

    public void setGeneracjaProcesora(int generacjaProcesora) {
        this.generacjaProcesora = generacjaProcesora;
    }

    public int getIloscRamuKartyGraficznej() {
        return iloscRamuKartyGraficznej;
    }

    public void setIloscRamuKartyGraficznej(int iloscRamuKartyGraficznej) {
        this.iloscRamuKartyGraficznej = iloscRamuKartyGraficznej;
    }

    public int getIloscRamu() {
        return iloscRamu;
    }

    public void setIloscRamu(int iloscRamu) {
        this.iloscRamu = iloscRamu;
    }

    public int getMocZasilacza() {
        return mocZasilacza;
    }

    public void setMocZasilacza(int mocZasilacza) {
        this.mocZasilacza = mocZasilacza;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Komputer{" +
                "nazwaFirmyProcesora='" + nazwaFirmyProcesora + '\'' +
                ", generacjaProcesora=" + generacjaProcesora +
                ", iloscRamuKartyGraficznej=" + iloscRamuKartyGraficznej +
                ", iloscRamu=" + iloscRamu +
                ", mocZasilacza=" + mocZasilacza +
                ", cena=" + cena +
                '}';
    }
}
