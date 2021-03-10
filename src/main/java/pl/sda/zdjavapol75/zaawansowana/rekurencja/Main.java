package pl.sda.zdjavapol75.zaawansowana.rekurencja;

public class Main {
    public static void main(String[] args) {

        System.out.println(sumujTabliceRekurencyjnie(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
        System.out.println(ciagFibonacciego(3));

    }

    public static int gcd(int a, int b) {
        return b != 0 ? gcd(b, a % b) : a;
    }

    public static int gcd2(int a, int b) {
        if (b != 0) {
            return gcd2(b, a % b);
        } else {
            return a;
        }
    }

    public static int sumujTabliceIteracyjnie(int[] tablica) {
        int sum = 0;
        for (int i : tablica) {
            sum += i;
        }
        return sum;
    }

    public static int sumujTabliceRekurencyjnie(int[] tablica) {
        return sumujTabliceRekurencyjnie(tablica, tablica.length - 1);
    }

    public static int sumujTabliceRekurencyjnie(int[] tablica, int i) {
        if (i > 0) {
            return tablica[i] + sumujTabliceRekurencyjnie(tablica, i - 1);
        } else {
            return tablica[i];
        }
    }

/*    public static int silnia(int a) {
        int toDoCzegoSieDomnaza = 1;
        for (int i = 1;i<=a;i++) {
            toDoCzegoSieDomnaza *=1;
        }
        return toDoCzegoSieDomnaza;
    }*/

    public static int silnia1(int a, int i) {
        if (i < a) {
            return i * silnia1(a, i + 1);
        } else {
            return a;
        }
    }

    public static int ciagFibonacciego(int a) {
        if (a == 0) {
            return 0;
        } else if (a == 1) {
            return 1;
        } else {
            return ciagFibonacciego(a - 1) + ciagFibonacciego(a - 2);
        }
    }
}
