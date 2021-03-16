package pl.sda.zdjavapol75.zaawansowana.binarySearch;

public class Main {
    public static void main(String[] args) {
        int tablicaIntow[] = new int[]{1,3,5,10,15,20,25};
        System.out.println(tablicaIntow(tablicaIntow,20));

    }

    public static int tablicaIntow(int[] tablicaInt, int szukana) {
        int lewy = 0;
        int prawy = tablicaInt.length-1;
        int srodek;
        while (lewy <= prawy) {
            srodek = (int) Math.floor(prawy + lewy) / 2;

            if (tablicaInt[srodek] < szukana) {
                lewy = srodek + 1;
            } else if (tablicaInt[srodek] > szukana) {
                prawy = srodek - 1;
            } else {
                return srodek;
            }
        }
        return -1;
    }
}
