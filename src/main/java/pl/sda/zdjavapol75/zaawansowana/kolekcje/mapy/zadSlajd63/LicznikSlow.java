package pl.sda.zdjavapol75.zaawansowana.kolekcje.mapy.zadSlajd63;

import java.util.*;

public class LicznikSlow {

    public static Map<String, Integer> zliczWystapieniaSlow(String tekst){
        String[] strings = tekst.toLowerCase().replaceAll("[.,;]","").split("\\s+");
        Map<String, Integer> wystapienieSlowa = new HashMap<>();

        for (String string : strings) {
            if(wystapienieSlowa.containsKey(string)){
                wystapienieSlowa.put(string, wystapienieSlowa.get(string) + 1);
            } else {
                wystapienieSlowa.put(string, 1);
            }
        }
        return wystapienieSlowa;
    }

    public static Map<String, Integer> sortujPoWartosciMalejaco(Map<String, Integer> mapToSort){
        List<Map.Entry<String, Integer>> lista = new ArrayList<>(mapToSort.entrySet());

        lista.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return -o1.getValue().compareTo(o2.getValue());
            }
        });

        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : lista) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
}
