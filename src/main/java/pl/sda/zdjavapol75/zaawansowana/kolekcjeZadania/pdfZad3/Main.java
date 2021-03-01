package pl.sda.zdjavapol75.zaawansowana.kolekcjeZadania.pdfZad3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        zwracanieElementow(losowanieWartosciWTablicy());

    }

    public static List<Integer> losowanieWartosciWTablicy() {
        Random random = new Random();
        List<Integer> listaWartosci = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            listaWartosci.add(random.nextInt(50));
        }
        return listaWartosci;
    }

    public static void zwracanieElementow(List<Integer> lista) {
        Set<Integer> zwrotUnikatow = new HashSet<>();
        Set<Integer> zwrotDuplikatow = new HashSet<>();
        for (Integer zwrot : lista) {
            if (!zwrotUnikatow.add(zwrot)) {
                zwrotDuplikatow.add(zwrot);
            }
        }

        System.out.println(zwrotDuplikatow);
        System.out.println(zwrotUnikatow);
    }

}
