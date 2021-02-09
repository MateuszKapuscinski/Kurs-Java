package pl.sda.zdjavapol75.działanie.statycznosc;

public class Pracownik {
    public static void main(String[] args) {
        Pracownik Jan = new Pracownik();
        Pracownik Kamil = new Pracownik();
        Jan.wejdzdoBiura();
        System.out.println(Biuro.getLiczbaOsobWewnatrz());
        Kamil.wejdzdoBiura();
        System.out.println(Biuro.getLiczbaOsobWewnatrz());
        Jan.wejdzdoBiura();
        System.out.println(Biuro.getLiczbaOsobWewnatrz());
        Jan.wyjdzZBiura();
        System.out.println(Biuro.getLiczbaOsobWewnatrz());
    }

    private void wejdzdoBiura() {
        Biuro.setLiczbaOsobWewnatrz(Biuro.getLiczbaOsobWewnatrz() + 1);
    }

    private void wyjdzZBiura() {
        Biuro.setLiczbaOsobWewnatrz(Biuro.getLiczbaOsobWewnatrz() - 1);
    }
}
