package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceKonstrukcyjne.singleton.eager.zad2;

import java.util.*;

public enum Servers {
    INSTANCE;

    private Set<String> serwers = new HashSet<>();

    public boolean dodaj(String nazwaSerwa) {
        if (sprawdzSerwer(nazwaSerwa)) {
            return serwers.add(nazwaSerwa);
        }
        return false;
    }

    private boolean sprawdzSerwer (String nazwaSerwera) {
        String nazwaSerwatemp = nazwaSerwera.toLowerCase();
        if (!nazwaSerwatemp.isEmpty()) {
            return (nazwaSerwatemp.startsWith("https")) || (nazwaSerwatemp.startsWith("http"));
        }
        return false;
    }

    private boolean isHttp(String nazwaSerwera) {
        return nazwaSerwera.toLowerCase().startsWith("http");
    }

    private boolean isHttps(String nazwaSerwera) {
        return nazwaSerwera.toLowerCase().startsWith("https");
    }

    public Set<String> getHttpList () {
        Set<String> serwersHttp = new HashSet<>();
        for (String serwers : serwers) {
            if (isHttp(serwers)) {
                serwersHttp.add(serwers);
            }
        }
        return serwersHttp;
    }
}
