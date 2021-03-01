package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.singleton.eager.zad1;

import pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.singleton.eager.zad1.Counter;

public class Main {
    public static void main(String[] args) {
        Counter counter = Counter.getInstance();
        Counter counter2 = Counter.getInstance();

        counter.zwieksz();
        counter2.zwieksz();
        System.out.println(counter.getValue());

    }
}
