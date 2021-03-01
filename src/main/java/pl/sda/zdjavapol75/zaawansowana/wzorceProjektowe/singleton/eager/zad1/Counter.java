package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.singleton.eager.zad1;

public class Counter {
    private static final Counter INSTANCE = new Counter();

    private int value = 0;

    private Counter() {
    }

    public static Counter getInstance () {
        return INSTANCE;
    }

    public void zwieksz() {
        value += 1;
    }

    public int getValue() {
        return value;
    }
}
