package pl.sda.zdjavapol75.podstawy.statycznosc;

public class Biuro {
    private static int liczbaOsobWewnatrz;

    public static int getLiczbaOsobWewnatrz() {
        return liczbaOsobWewnatrz;
    }

    public static void setLiczbaOsobWewnatrz(int liczbaOsobWewnatrz) {
        Biuro.liczbaOsobWewnatrz = liczbaOsobWewnatrz;
    }

}
