package pl.sda.zdjavapol75.działanie.obiekty.zadaniaObiekty.zadOsobaBank;

public class KontoBankowe {
    private long numerKonta;
    private int stanKonta;

    public void wyswietlStanKonta() {
        System.out.println("Stan konta to " + stanKonta);

    }
    public void wplacSrodki(int wplata) {
    stanKonta += wplata;
    wyswietlStanKonta();
    }
    public int pobierzSrodki (int pobranie) {
        stanKonta -= pobranie;
        return pobranie;
    }

    public KontoBankowe (long numerKonta,int stanKonta) {
        this.numerKonta = numerKonta;
        this.stanKonta = stanKonta;
    }

    public void setNumerKonta (long numerKonta) {
        this.numerKonta = numerKonta;
    }

    public int getStanKonta () {
        return stanKonta;

    }

}
