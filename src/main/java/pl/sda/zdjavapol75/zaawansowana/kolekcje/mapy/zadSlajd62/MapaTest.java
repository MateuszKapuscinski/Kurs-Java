package pl.sda.zdjavapol75.zaawansowana.kolekcje.mapy.zadSlajd62;

import java.util.Map;
import java.util.TreeMap;

public class MapaTest {
    public static void main(String[] args) {

        Map<String, Integer> mapaWieku = new TreeMap<>();
        mapaWieku.put("Darek", 50);
        mapaWieku.put("Tomasz", 72);
        mapaWieku.put("Artur", 23);

        mapaWieku.entrySet();

        System.out.println(mapaWieku);
        mapaWieku.put("Artur", 250);
        System.out.println(mapaWieku);


        for (String klucz : mapaWieku.keySet()) {
            System.out.println("Klucz jest: " + klucz + ", a wartosc: " + mapaWieku.get(klucz));
        }
        System.out.println("______________________________________________");

        /*
         tutaj moja niewydajna proba ulozenia mapy wedlug wartosci:
         List<Integer> zbiorWartosci = new ArrayList<>(mapaWieku.values());
        zbiorWartosci.sort(null);
        System.out.println(zbiorWartosci);
        Map<String, Integer> sortedMapaWieku = new LinkedHashMap<>();
        for (Integer wartosc : zbiorWartosci) {
            for (String key : mapaWieku.keySet()) {
                if (mapaWieku.get(key) == wartosc) {
                    sortedMapaWieku.put(key,wartosc);
                }
            }
        }
        for (String klucz : sortedMapaWieku.keySet()) {
            System.out.println("Klucz jest: " + klucz + ", a wartosc: " + mapaWieku.get(klucz));
        }
        */

    }
}
