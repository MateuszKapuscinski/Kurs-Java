package pl.sda.zdjavapol75.działanie.enumy;

public enum Bilet {
    ULGOWY_GODZINNY(1.50, 60),
    ULGOWY_CALODOBOWY(2.30, 1440),
    NORMALNY_GODZINNY(2.20, 60),
    NORMALNY_CALODNIOWY(3.10, 1440),
    BRAK_BILETU(0, 0);


    private double cena;
    private int czasJazdyWMinutach;

    Bilet(double cena, int czasJazdyWMinutach) {
        this.cena = cena;
        this.czasJazdyWMinutach = czasJazdyWMinutach;
    }

    public double pobierzCeneBiletu() {
        return this.cena;
    }

    public int pobierzCzasJazdy() {
        return this.czasJazdyWMinutach;
    }

    public void wyswietlDaneOBilecie() {
        System.out.println("Bilet " + this);
    }

    public static Bilet wyznaczBilet(int wiek, int czasJazdyWMinutach, double kwota) {
        if (wiek < 26) {
            if (czasJazdyWMinutach < 60) {
                if (kwota >= ULGOWY_GODZINNY.cena) {
                    return ULGOWY_GODZINNY;
                } else {
                    return BRAK_BILETU;
                }
            }
        }
        if (wiek < 26) {
            if (czasJazdyWMinutach < 1440) {
                if (kwota >= ULGOWY_CALODOBOWY.cena) {
                    return ULGOWY_CALODOBOWY;
                } else {
                    return BRAK_BILETU;
                }
            }
        }
        if (wiek >= 26) {
            if (czasJazdyWMinutach < 60) {
                if (kwota >= NORMALNY_GODZINNY.cena) {
                    return NORMALNY_GODZINNY;
                } else {
                    return BRAK_BILETU;
                }
            }
        }
        if (wiek >= 26) {
            if (czasJazdyWMinutach < 1440) {
                if (kwota >= NORMALNY_CALODNIOWY.cena){
                    return NORMALNY_CALODNIOWY;
                }else {
                    return BRAK_BILETU;
                }
            }
        }
        return BRAK_BILETU;
    }
}