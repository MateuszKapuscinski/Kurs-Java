package pl.sda.zdjavapol75.zaawansowana.funkcyjne.streamApi.operacjeKonczace;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        Set<Integer> integerSet = List.of(1, 2, 3, 4, 5).stream()
                .map((value) -> value * 2)
                .collect(Collectors.toSet());


        System.out.println(List.of(1, 2, 3, 4, 5).stream()
                .collect(Collectors.toMap(
                        (value -> String.valueOf(value)),
                        (value -> value * 10))
                )
        );

    }
}
