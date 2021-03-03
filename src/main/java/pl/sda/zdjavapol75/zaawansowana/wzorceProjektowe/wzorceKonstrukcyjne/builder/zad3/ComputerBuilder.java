package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceKonstrukcyjne.builder.zad3;

public class ComputerBuilder {
    private String procesor;
    private String kartaGraficzna;
    public ComputerBuilder withProcesor(String procesor){
        this.procesor = procesor;
        return this;
    }
    public ComputerBuilder withKartaGraficzna(String kartaGraficzna){
        this.kartaGraficzna = kartaGraficzna;
        return this;
    }
    public Computer build(){
        return new Computer(procesor, kartaGraficzna);
    }
}
