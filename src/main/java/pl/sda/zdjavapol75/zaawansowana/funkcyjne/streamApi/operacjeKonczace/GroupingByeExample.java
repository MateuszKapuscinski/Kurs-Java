package pl.sda.zdjavapol75.zaawansowana.funkcyjne.streamApi.operacjeKonczace;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByeExample {

    public static void main(String[] args) {

        List<String> names = List.of("A", "Ala", "bob", "Alice", "Mark", "Martin", "Montu", "Marecz");

        // pogrupowanie wg pierwszej litery imienia
        names.stream()
                .collect(Collectors.groupingBy((x) -> x.substring(0, 1)))
                .forEach((key, value) -> System.out.println(key + " " + value));

        System.out.println("________________________________________________________________");


        //zliczenie wystapien imion:
        Map<String, Long> mapaWystapienSlow = names.stream()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        System.out.println(mapaWystapienSlow);
    }
}
