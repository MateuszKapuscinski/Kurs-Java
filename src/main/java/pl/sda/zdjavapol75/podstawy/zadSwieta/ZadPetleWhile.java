package pl.sda.zdjavapol75.podstawy.zadSwieta;

import java.util.Scanner;

public class ZadPetleWhile {
    public static void main(String[] args) {
        // zad 1 a)
        /*int a = 1;
        while (a <= 100) {
            System.out.println(a);
            a++
        } */

        //zad 1 b)
         /*int a = 1000;
        while (a <= 1020) {
            System.out.print(a + "," + " ");
            a++;
        } */

        //zad 1 c)
         /* int a = (-30);
        while (a <= 1000) {
            if (a % 5 ==0) {
                System.out.println(a);
            }
            a++;
        }*/

        //zad 1 d)
         /* int a = 1;
        while (a <= 100) {
            if (a % 3 == 0) {
                System.out.println(a);
            }
            a++;
        }*/

        //zad 1 e)
        /* int a = 30;
        while (a <= 300) {
            if (a % 3 == 0 && a % 5 ==0) {
                System.out.println(a);
            }
            a++;
        }*/

        //zad 1 f)
         /* int a = (-300);
        while (a < 300) {
            if (a % 2 == 0) {
                System.out.print("(" + ++a + ")" + " ;");
            }
            a++;
        }*/

        //zad 1 g)
        /*  int a = (-100);
        while (a <= 100) {
            if (a % 2 == 0) {
                System.out.print("(" + a + ")" + " ;");
            }
            a++;
        } */

        //zad 1 h)
        /*char a = 'a';
        while (a <= 'z') {
            System.out.println(a++);
        }*/

        //zad 1 i)
         /*char a = 'A';
        while (a <= 'Z') {
            System.out.println(a++);
        }*/

        //zad1 j)
        /* char a = 'A';
        while (a <= 'Z') {
            System.out.println(a++);
            a++;
        }*/

        //zad1 k)
        /*char a = 'b';
        while (a <= 'z') {
            a++;
            if (a % 5 == 0) {
                System.out.println(a++);
            }
        }*/

        //zad1 l)
        /*int a = 0;
        int b = 0;
        while (a <= 100) {
            while (b <100) {
                a++;
                b++;
                System.out.println(b + "." + " Hello World");
            }
        }*/

        //zad 2 petla for
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe ile razy mam powtorzyc Hello World");
        int parametr = scanner.nextInt();
        for (int i = 0; i <= parametr; i++) {
            if (i < parametr) {
                System.out.println("Hello World");
            }
        }*/

        // zad 2 petla while
        /*Scanner scanner = new Scanner(System.in);
        int i = 0;
        System.out.println("Podaj liczbe ile razy mam powtorzyc Hello World");
        int parametr = scanner.nextInt();
        while (i < parametr) {
            System.out.println("Hello World");
            i++;
        }*/

        // zad 3
         /*Scanner scanner = new Scanner(System.in);
        int parametr;
        do {
            System.out.println("Podaj liczbe");
            parametr = scanner.nextInt();
            for (int i = parametr - 1; i >= 0; i--) {
                System.out.println("Hello World");
            }
        } while (parametr != 0); */

        // zad 4 dokonczyc b)
        /*        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int poczatekZakresu = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int koniecZakresu = scanner.nextInt();
        if (poczatekZakresu < koniecZakresu) {
            System.out.println("Podaj dzielnik");
            int dzielnik = scanner.nextInt();
            for (int i = poczatekZakresu; i <= koniecZakresu; i++) {
                if (i % dzielnik == 0 || koniecZakresu % dzielnik == 0) {
                    System.out.println(i);
                }
            }
            System.out.println("Podaj ilość dzielników");
            int iloscDzielnikow = scanner.nextInt();
            for (int j = 1; j <= iloscDzielnikow; j++) {
                if (iloscDzielnikow % j == 0) {
                }
                for (int k = poczatekZakresu; k <= koniecZakresu; k++) {
                    if (k % j == 0 && koniecZakresu % j == 0) {
                        System.out.println(k);
                    }
                }
                System.out.println(j);
            }
        } else {
            System.out.println("Podałeś złe liczby");

        } */

        // zad 6
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i *= 2) {
            System.out.println(i);
        }*/

        //zad 7
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int a = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int b = scanner.nextInt();
        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }


        // zad 9
         /*Scanner sc = new Scanner(System.in);
        int losowyNumer;
        Random r = new Random();
        losowyNumer = r.nextInt(100) + 1;
        int losUzytkownik;
        do {
            System.out.println("Podaj liczbę");
            losUzytkownik = sc.nextInt();
            if (losowyNumer > losUzytkownik) {
                System.out.println("Podałeś za niską wartość");
            } else if (losowyNumer < losUzytkownik) {
                System.out.println("Podałeś za dużą wartość");
            }
        }while (losUzytkownik != losowyNumer);
        System.out.println("Gratulacje"); */

        //zad 10
        /* Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wysokość choinki");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {  //pierwsza dla liczby wierszy,
            for (int j = n + (n / 2); j > i; j--) {   //Druga do drukowania przestrzeni,
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");    // trzecia do drukowania gwiazd.
            }
            System.out.println("");
        }*/

        // zad 11
         /*Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int liczba = scanner.nextInt();
        for (int i = 1; i <= liczba; i++) {
            if (liczba % i == 0) {

                System.out.println(i);
            }
        }*/

        //zad 17 petla for

        //a)
        /*int i;
        for (i = (-200); i >= (-1000); i--) {
            System.out.println(i);
        }*/
        // b) // druga połowa do skończenia
        /*int i;
        for (i = 1000;i <= 100000 ;i++) {
            System.out.print(i + " ");
        }*/
        // c)
        /*for (int i = 5; i <= 10; i++) {
            for (int j = 5; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }*/ //d)
        /* Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę a");
    int a = scanner.nextInt();
        System.out.println("Podaj liczbę b");
    int b = scanner.nextInt();
        for (int i = a; i <= b;i++){
        for (int j = a; j <=b; j++){
            System.out.println(i + " * " + j + " = " + i * j);
        }
    }*/

        //zad 17 petla while
        //a)
        /*int i = (-200);
        while (i >= (-1000)) {
            System.out.println(i--);
        }*/
        //b) do zrobienia
        /*int i = 1000;
        while (i <= 100000) {
            System.out.print(i++ + " ");
        }*/
        // c)
        /*int i = 5;
        int j = 5;
        int a,b;
        while (i <= 10 && j <= 10)  {
            System.out.println(i + " * " + j + " = " + i++ * j++);
        }*/
        // d)
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę a");
        int a = scanner.nextInt();
        System.out.println("Podaj liczbę b");
        int b = scanner.nextInt();
        while (a <= b) {
            while (a <=b) {
                System.out.println(a + " * " + b + " = " + a * b);
                a++;
            }
        }*/

    }
}
