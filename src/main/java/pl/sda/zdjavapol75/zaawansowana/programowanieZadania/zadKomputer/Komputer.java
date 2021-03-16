package pl.sda.zdjavapol75.zaawansowana.programowanieZadania.zadKomputer;

public class Komputer {
    private int potrzebnaMoc;
    private String producent;
    private TypProcesora typProcesora;

    public int getPotrzebnaMoc() {
        return potrzebnaMoc;
    }

    public void setPotrzebnaMoc(int potrzebnaMoc) {
        this.potrzebnaMoc = potrzebnaMoc;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public TypProcesora getTypProcesora() {
        return typProcesora;
    }

    public void setTypProcesora(TypProcesora typProcesora) {
        this.typProcesora = typProcesora;
    }

    public Komputer(int moc, String producent, TypProcesora typProcesora) {
        this.potrzebnaMoc = moc;
        this.producent = producent;
        this.typProcesora = typProcesora;
    }

    @Override
    public String toString() {
        return "Komputer{" +
                "moc=" + potrzebnaMoc +
                ", producent='" + producent + '\'' +
                ", typProcesora=" + typProcesora +
                '}';
    }
}
