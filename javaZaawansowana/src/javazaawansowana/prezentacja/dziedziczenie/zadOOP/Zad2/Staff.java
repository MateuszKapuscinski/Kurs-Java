package javazaawansowana.prezentacja.dziedziczenie.zadOOP.Zad2;

public class Staff extends Person{
    private String specjalizacja;
    private double wynagrodzenie;

    public Staff(String specjalizacja, double wynagrodzenie) {
        this.specjalizacja = specjalizacja;
        this.wynagrodzenie = wynagrodzenie;
    }

    public String getSpecjalizacja() {
        return specjalizacja;
    }

    public double getWynagrodzenie() {
        return wynagrodzenie;
    }

    public void setSpecjalizacja(String specjalizacja) {
        this.specjalizacja = specjalizacja;
    }

    public void setWynagrodzenie(double wynagrodzenie) {
        this.wynagrodzenie = wynagrodzenie;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "specjalizacja='" + specjalizacja + '\'' +
                ", wynagrodzenie=" + wynagrodzenie +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
