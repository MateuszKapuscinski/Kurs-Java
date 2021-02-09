package pl.sda.zdjavapol75.działanie.stringiIWyrazeniaRegularne;

import java.util.Scanner;

public class WyrazeniaRegularne {

    public static String zlacz(String pierwszy, String drugi) {
        //usuniecie znakow z poczatku i konca linii
        pierwszy = pierwszy.trim();
        drugi = drugi.trim();
        // usuniecie 2 znakow z konca i z poczatku
        pierwszy = pierwszy.substring(2, pierwszy.length() - 2);
        drugi = drugi.substring(2, drugi.length() - 2);
        return pierwszy.concat(drugi);
    }
    public static String usunSamogloski(String zKtoregoUsunac) {
        return zKtoregoUsunac.replaceAll("[aeouiyAEOUIY]", "");
    }
    public static String usunLiczbyWiekszeOdDziewiec(String zKtoregoUsunac) {
        return zKtoregoUsunac.replaceAll("\\d{2,}", "");
    }
    public static String zamienSlowaZDuzejLitery(String zdanieDoSprawdzenia, String naCoZamienic) {
        return zdanieDoSprawdzenia.replaceAll("[A-Z]\\w*", naCoZamienic);
    }
    public static String zamienKoniecZdania(String zdanie) {
        /*
        Rozwiazanie nizej rowniez zadziala dla zadania 8
        return zdanie.replace(".", ".\n");
        */
        return zdanie.replaceAll("\\.\\s[A-Z]", "\\. \n");
    }
}
