package pl.sda.zdjavapol75.zaawansowana.funkcyjne.streamApi.operacjePosrednie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterExample {

    public static void main(String[] args) {

        int[] tablica = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> listaIntow = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        Arrays.stream(tablica)
                .filter(element -> element % 2 == 0)
                .forEach(System.out::println);


        listaIntow.stream()
                .filter(element -> element % 2 == 0)
                .forEach(System.out::println);


    }
}
