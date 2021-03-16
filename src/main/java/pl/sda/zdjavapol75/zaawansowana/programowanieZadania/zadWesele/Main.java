package pl.sda.zdjavapol75.zaawansowana.programowanieZadania.zadWesele;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ilość zaproszonych osób: " + policzGosci(pobierzInformacjeOGosciach()));
    }

    public static int iloscZaproszen() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile zaproszen?");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Podano nieprawidlową wartość, proszę podać liczbę większą od 0");
            return iloscZaproszen();

        }
    }

    public static Zaproszenie[] pobierzInformacjeOGosciach() {
        Scanner scanner = new Scanner(System.in);
        int liczbaZaproszen = iloscZaproszen();

        String imie;
        String nazwisko;
        typZaproszenia typZaproszenia = null;
        String zaproszenie;

        Zaproszenie[] zaproszenia = new Zaproszenie[liczbaZaproszen];
        for (int i = 0; i < liczbaZaproszen; i++) {
            System.out.println("Podaj imie:");
            imie = scanner.next();

            System.out.println("Podaj nazwisko:");
            nazwisko = scanner.next();

            System.out.println("Czy zaproszenie jest z osobą towarzyszącą");
            zaproszenie = scanner.next();
            while (!zaproszenie.equalsIgnoreCase("tak") && !zaproszenie.equalsIgnoreCase("nie")) {
                System.out.println("Podałeś nieprawidłową odpowiedź, proszę odpowiedzieć TAK lub NIE.");
                zaproszenie = scanner.nextLine();
            }
            if (zaproszenie.equalsIgnoreCase("tak")) {
                typZaproszenia = typZaproszenia.Z_OS_TOWARZYSZACO;
            } else if (zaproszenie.equalsIgnoreCase("nie")) {
                typZaproszenia = typZaproszenia.POJEDYNCZE;
            }

            zaproszenia[i] = new Zaproszenie(imie, nazwisko, typZaproszenia);
            System.out.println("Pomyślnie dodano zaproszenie!");
        }
        System.out.println(Arrays.toString(zaproszenia));
        return zaproszenia;
    }

    public static int policzGosci(Zaproszenie[] listaGosci) {
        int liczbaZaproszonych = 0;
        for (Zaproszenie zaproszenie : listaGosci) {
            if (zaproszenie.typZaproszenia == typZaproszenia.Z_OS_TOWARZYSZACO) {
                liczbaZaproszonych += 2;
            } else if (zaproszenie.typZaproszenia == typZaproszenia.POJEDYNCZE) {
                liczbaZaproszonych++;
            }
        }
        return liczbaZaproszonych;

    }
}
