package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.singleton.builder.zad2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listaSkladnikow = new ArrayList<>();
        listaSkladnikow.add("salata");
        listaSkladnikow.add("ogorek");
        listaSkladnikow.add("pomidor");
        listaSkladnikow.add("bulka");
        listaSkladnikow.add("sos");
        Burger burger = new Burger.Builder()
                .listaSkladnikow(listaSkladnikow)
                .jakaCena(23.30)
                .jakaWaga("900 gramow")
                .burger();

        System.out.println(burger);
    }
}
