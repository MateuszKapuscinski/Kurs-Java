package pl.sda.zdjavapol75.działanie.enumy;

public class Main {
    public static void main(String[] args) {
        Bilet bilet = Bilet.ULGOWY_CALODOBOWY;
        Bilet.ULGOWY_GODZINNY.wyswietlDaneOBilecie();
        System.out.println(Bilet.wyznaczBilet(22, 51, 3.30));
        System.out.println(Bilet.wyznaczBilet(28, 51, 4.20));
    }
}
