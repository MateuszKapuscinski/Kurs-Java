package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceBehawioralne.interpretator;

public class MatematyczneOperacjeLinux implements MatematycznyInterpreter{
    private double liczb1;
    private double liczb2;
    public MatematyczneOperacjeLinux(double liczb1, double liczb2) {
        this.liczb1 = liczb1;
        this.liczb2 = liczb2;
    }
    @Override
    public double interpretuj(MatematyczneOperacje operacja) {
        switch(operacja){
            case DODAJ_LINUX:
                return liczb1 + liczb2;
            case ODEJMIJ_LINUX:
                return liczb1 - liczb2;
            case PODZIEL_LINUX:
                return liczb1 / liczb2;
            default:
                System.out.println("Tej operacji nie obsługujemy w LINUX: " + operacja);
                throw new RuntimeException();
        }
    }
}
