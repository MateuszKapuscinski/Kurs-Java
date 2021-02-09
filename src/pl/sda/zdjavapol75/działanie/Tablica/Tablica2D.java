package pl.sda.zdjavapol75.działanie.Tablica;

public class Tablica2D {
    public static void main(String[] args) {

        int[][] tablica2D = new int[10][10];
        // pętla zewnętrzna generuje indeksy rzędów    Pętla na wpisanie wartości do tablic
        for (int i = 0; i < 10; i++) {
            // pętla wewnętrzna generuje indeksy kolumn
            for (int j = 0; j < 10; j++) {

                tablica2D[i][j] = (i + 1) * (j + 1);
            }
        }

        // pętla na wypisanie tablicy do konsoli

        for (int i = 0; i < tablica2D.length; i++) {
            for (int j = 0; j < tablica2D[i].length; j++) {
                System.out.print(tablica2D[i][j] + " ");
            }
            System.out.println();
        }

    }
}