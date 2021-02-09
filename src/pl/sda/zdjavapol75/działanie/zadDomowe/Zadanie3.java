package pl.sda.zdjavapol75.działanie.zadDomowe;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Liczba A");
        int liczbaA = scanner.nextInt();

        System.out.println("Liczba B");
        int liczbaB = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Wybierz przedział: parzysty czy nieparzysty");
        String wybor = scanner.nextLine();

        switch (wybor) {
            case "parzysty":
                for (int i = liczbaA; i < liczbaB; ++i) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }
                break;
            case "nieparzysty":
                for (int i = liczbaA; i < liczbaB; i++) {
                    if (i % 2 == 0) {
                        System.out.println(++i);
                    }
                }
                break;
        }
    }
}

