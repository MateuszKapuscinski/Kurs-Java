package pl.sda.zdjavapol75.podstawy.zadSwieta;

import java.util.Random;

public class ZadTablice {
    public static void main(String[] args) {

        // zad 1

       /* Random r = new Random();
        int[] tab = new int[10];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = r.nextInt(tab.length + 10 + 1) - 10;
            System.out.println("Element tablicy : " + tab[i]);
        }

        int min = tab[0];
        int cos = 0, cos2 = 0;
        int max = tab[0];
        int sum = 0;
        int licznik = 0;
        for (int i = 0; i < tab.length; i++) {
            if (min > tab[i]) {
                min = tab[i];
            }
            if (max < tab[i]) {
                max = tab[i];
            }
            sum = sum + tab[i];
            licznik++;
            if (sum / licznik < tab[i]) {
                cos++;
            }else if (sum / licznik >tab[i]){
                cos2++;
            }
        }
        System.out.println("Najmniejszy element w tabeli to : " + min);
        System.out.println("Największy element w tabeli to : " + max);
        System.out.println("Srednia elementów w tabeli to : " + (double) sum / licznik);
        System.out.println("Elementy większe od średniej : " + cos);
        System.out.println("Elementy mniejsze od średniej : " + cos2);


        for (int i = tab.length - 1; i >= 0; i--){
            System.out.println("Element odwrócony tablicy : " + tab[i]);
        }

        Arrays.sort(tab);
        double mediana;

        if (tab.length % 2 == 0) {
            mediana = ((double) tab[tab.length / 2] +
                    (double) tab[tab.length / 2 - 1]) / 2;
        } else {
            mediana = (double) tab[tab.length/2];
        }
        System.out.println("Mediana wynosi : " + mediana);
        */

        // zad 2

        Random r = new Random();
        int[] tab = new int[20];
        int cos2 = 0;
        for (int i = 0; i < tab.length; i++) {
            int cos = r.nextInt(tab.length - 10) + 1 ;
            if (cos == cos) {
                cos = cos2;
            }else if (cos != cos)
            System.out.println("Element tablicy : " + cos);
        }

    }
}

