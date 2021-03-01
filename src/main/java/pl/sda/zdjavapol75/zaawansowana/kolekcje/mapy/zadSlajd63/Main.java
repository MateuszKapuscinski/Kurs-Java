package pl.sda.zdjavapol75.zaawansowana.kolekcje.mapy.zadSlajd63;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String slowoDoPoliczenia = scanner.nextLine();
        Map<String, Integer> policzoneSlowa = LicznikSlow.zliczWystapieniaSlow(slowoDoPoliczenia);
        //System.out.println(policzoneSlowa);
        policzoneSlowa = LicznikSlow.sortujPoWartosciMalejaco(policzoneSlowa);
        System.out.println(policzoneSlowa);
    
    }
}

