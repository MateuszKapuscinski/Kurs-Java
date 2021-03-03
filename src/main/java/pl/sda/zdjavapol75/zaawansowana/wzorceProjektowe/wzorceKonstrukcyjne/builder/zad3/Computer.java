package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceKonstrukcyjne.builder.zad3;

public class Computer {
    private String procesor;
    private String kartaGraficzna;
    protected Computer(String procesor, String kartaGraficzna) {
        this.procesor = procesor;
        this.kartaGraficzna = kartaGraficzna;
    }
    public String getProcesor() {
        return procesor;
    }
    public String getKartaGraficzna() {
        return kartaGraficzna;
    }
    @Override
    public String toString() {
        return "Computer{" +
                "procesor='" + procesor + '\'' +
                ", kartaGraficzna='" + kartaGraficzna + '\'' +
                '}';
    }
}
