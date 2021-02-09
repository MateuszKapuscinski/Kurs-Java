package javazaawansowana.prezentacja.dziedziczenie.zadSlajd88;

public class Kabriolet extends Samochod {

    protected boolean czyDachSchowany;

    public Kabriolet(String kolor, String marka, int rocznik, boolean swiatla, double predkosc) {
        super(kolor, marka, rocznik, swiatla, predkosc);
    }


    @Override
    public void przyspiesz() {
        if (predkosc < 180) {
            predkosc += 10;
            System.out.println("Przyspieszam do " + predkosc + " km/h");
        } else {
            System.out.println("Sorry, za szybko");
        }
    }

    public void schowajDach() {
        czyDachSchowany = true;
    }

    public boolean czyDachSchowany() {
        if (czyDachSchowany = true) {
            System.out.println("Dach jest juz schowany");
        }
        return czyDachSchowany;
    }

    @Override
    public String toString() {
        return super.toString() + " z rozsuwanym dachem";
    }
}
