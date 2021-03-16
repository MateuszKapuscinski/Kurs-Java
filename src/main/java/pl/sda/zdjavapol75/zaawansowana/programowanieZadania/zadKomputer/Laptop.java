package pl.sda.zdjavapol75.zaawansowana.programowanieZadania.zadKomputer;

public class Laptop extends Komputer {
    private double wielkoscMatrycy;
    private boolean czyPosiadaRetine;


    public Laptop(int moc, String producent, TypProcesora typProcesora, double wielkoscMatrycy, boolean czyPosiadaRetine) {
        super(moc, producent, typProcesora);
        this.wielkoscMatrycy = wielkoscMatrycy;
        this.czyPosiadaRetine = czyPosiadaRetine;
    }

    public double getWielkoscMatrycy() {
        return wielkoscMatrycy;
    }

    public void setWielkoscMatrycy(double wielkoscMatrycy) {
        this.wielkoscMatrycy = wielkoscMatrycy;
    }

    public boolean isCzyPosiadaRetine() {
        return czyPosiadaRetine;
    }

    public void setCzyPosiadaRetine(boolean czyPosiadaRetine) {
        this.czyPosiadaRetine = czyPosiadaRetine;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "wielkoscMatrycy=" + wielkoscMatrycy +
                ", czyPosiadaRetine=" + czyPosiadaRetine +
                '}';
    }
}
