package pl.sda.zdjavapol75.zaawansowana.kolekcje.set.zadanie3;

import java.util.*;

public class LottoGra {
    public static void main(String[] args) {
        podsumowanie();
    }

    public static Set<Integer> zagraj() {
        Set<Integer> podaneLiczbyOdUzytkownika = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe z zakresu 1-49");
        int pierwsza = scanner.nextInt();
        if (pierwsza >= 1 && pierwsza <= 49) {
            System.out.println("Podaj liczbe z zakresu 1-49");
        }
        int druga = scanner.nextInt();
        if (druga >= 1 && druga <= 49) {
            System.out.println("Podaj liczbe z zakresu 1-49");
        }
        int trzecia = scanner.nextInt();
        if (trzecia >= 1 && trzecia <= 49) {
            System.out.println("Podaj liczbe z zakresu 1-49");
        }
        int czwarta = scanner.nextInt();
        if (czwarta >= 1 && czwarta <= 49) {
            System.out.println("Podaj liczbe z zakresu 1-49");
        }
        int piata = scanner.nextInt();
        if (piata >= 1 && piata <= 49) {
            System.out.println("Podaj liczbe z zakresu 1-49");
        }
        int szosta = scanner.nextInt();
        if (szosta >= 1 && szosta <= 49) {
            System.out.println("Podaj liczbe z zakresu 1-49");
        }

        podaneLiczbyOdUzytkownika.add(pierwsza);
        podaneLiczbyOdUzytkownika.add(druga);
        podaneLiczbyOdUzytkownika.add(trzecia);
        podaneLiczbyOdUzytkownika.add(czwarta);
        podaneLiczbyOdUzytkownika.add(piata);
        podaneLiczbyOdUzytkownika.add(szosta);

       return podaneLiczbyOdUzytkownika;
    }

    private static Set<Integer> przeprowadzLosowanie() {
        Set<Integer> wylosowaneLiczby = new HashSet<>();

        Random random = new Random();
        int pierwsza = random.nextInt(49) + 1;
        int druga = random.nextInt(49) + 1;
        int trzecia = random.nextInt(49) + 1;
        int czwarta = random.nextInt(49) + 1;
        int piata = random.nextInt(49) + 1;
        int szosta = random.nextInt(49) + 1;

        wylosowaneLiczby.add(pierwsza);
        wylosowaneLiczby.add(druga);
        wylosowaneLiczby.add(trzecia);
        wylosowaneLiczby.add(czwarta);
        wylosowaneLiczby.add(piata);
        wylosowaneLiczby.add(szosta);

        return wylosowaneLiczby;
    }

    public static int zwrocWynik(Set<Integer> liczbyOdUzytkownika,Set<Integer> wylosowaneLiczby) {
        int licznik = 0;
        for (int liczby: liczbyOdUzytkownika) {
            if (wylosowaneLiczby.contains(liczby)) {

                licznik++;
            }
        }
        return licznik;
    }

     public static void podsumowanie () {
         Set<Integer> zagrajWGre = zagraj();
         Set<Integer> wylosowaneLiczby = przeprowadzLosowanie();
         int wynik = zwrocWynik(zagrajWGre,wylosowaneLiczby);

         System.out.println("Liczby podane przez uzytkownika: " + zagrajWGre);
         System.out.println("Liczby wylosowane przez kumputer: " + wylosowaneLiczby);
         System.out.println("Ilosc trafionych liczb: " + wynik);
    }
}
