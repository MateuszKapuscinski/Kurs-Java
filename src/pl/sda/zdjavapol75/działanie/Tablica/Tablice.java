package pl.sda.zdjavapol75.działanie.Tablica;

public class Tablice {

    public static void main(String[] args) {
        // zadanie 1
        int[] liczby = new int[]{1, 3, 5, 10};
        // zadanie 2
        System.out.println(liczby[0]);
        System.out.println(liczby[3]);
        // zadanie 3
        for (int i = 0; i < liczby.length; i++) {
            if (i % 2 == 0) {


                System.out.println(liczby[i]);
            }
        }
        //zadanie 5
        for (int i = 0; i < liczby.length; i++) {
            if (liczby[i] % 2 == 0) {

                System.out.println(liczby[i]);
            }
        }
    }
}
