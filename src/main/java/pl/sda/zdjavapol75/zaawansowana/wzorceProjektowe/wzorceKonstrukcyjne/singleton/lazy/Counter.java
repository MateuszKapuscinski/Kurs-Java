package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceKonstrukcyjne.singleton.lazy;

public class Counter {
    private static Counter INSTANCE;

    private int licznik = 0;

    private Counter() {
    }

    public static Counter getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (Counter.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Counter();
                }
            }
        }
        return INSTANCE;
    }

    public void zwieksz() {
        licznik += 1;
    }

    public int getLicznik() {
        return licznik;
    }
}