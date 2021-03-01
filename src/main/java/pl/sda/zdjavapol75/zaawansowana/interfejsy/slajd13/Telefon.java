package pl.sda.zdjavapol75.zaawansowana.interfejsy.slajd13;

import java.util.Random;

public class Telefon implements Dzwoni {
    String numerTelefonu = "555-666-666";
    int lacznyCzasRozmow = 0;

    @Override
    public void zadzwon(String numerTelefonu) {
        Random random = new Random();
        Random random2 = new Random();
        int losowaLiczba = random.nextInt(11);
        int losowaLiczba2 = random2.nextInt(60) + 1;
        if (losowaLiczba <= 5) {
            System.out.println("dodzwoniles sie na numer " + numerTelefonu);
            if (losowaLiczba2 >= 1) {
                lacznyCzasRozmow = losowaLiczba2;
                System.out.println("rozmowa trwala " + lacznyCzasRozmow + " minut");
            }
        } else if (losowaLiczba > 5) {
            System.out.println("Nie udalo sie polaczyc z wybranym numerem");
        }
    }

    @Override
    public void zadzwonNaNumerAlarmowy() {
        zadzwon(numerAlarmowy);
    }


}
