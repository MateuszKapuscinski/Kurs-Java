package pl.sda.zdjavapol75.podstawy.zadDomowe;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Liczba A");
        int liczbaA = scanner.nextInt();
        System.out.println("Liczba B");
        int liczbaB = scanner.nextInt();

        for (int i = liczbaA +1; i < liczbaB; ++i) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}

