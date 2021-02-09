package pl.sda.zdjavapol75.działanie.metody;

public class MetodaZadanie {
    public static void main(String[] args) {

        drukujParzystosciLiczby(6);
        System.out.println(czyLiczbaJestParzysta(17));


    }

    public static void drukujParzystosciLiczby(int parametr) {
        if (parametr % 2 == 0) {
            System.out.println("liczba jest parzysta");
        } else {
            System.out.println("liczba jest nieparzysta");
        }
    }

    public static boolean czyLiczbaJestParzysta(int parametr) {
        if (parametr % 2 == 0) {
            return true;

        } else {
            return false;

        }
    }
}
