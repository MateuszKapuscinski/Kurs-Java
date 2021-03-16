package pl.sda.zdjavapol75.zaawansowana.programowanieZadania.zadZamowienia;

public class Zamowienie {
    protected Pozycja[] pozycje;
    protected int maxRozmiar;

    public Zamowienie() {
        maxRozmiar = 10;
        pozycje = new Pozycja[maxRozmiar];
    }

    public Zamowienie(int maxRozmiar) {
        this.maxRozmiar = maxRozmiar;
        pozycje = new Pozycja[maxRozmiar];
    }

    public void dodajPozycje(Pozycja pozycjaDoDodania) {
        int count = 0;
        for (int i = 0; i < maxRozmiar; i++) {
            if (pozycje[i] != null) {
                count++;
            }
        }

        if (count == maxRozmiar) {
            System.out.println("Tablica pozycji jest pełna, nie możesz nic dodac!");
        } else {
            for (int i = 0; i < maxRozmiar; i++) {
                if (pozycje[i] == null) {
                    pozycje[i] = pozycjaDoDodania;
                    break;
                }
            }
            System.out.println("Pomyslnie dodano pozycje.");
        }
    }

    public double obliczWartosc () {
        double suma = 0;
        for (int i = 0; i < maxRozmiar; i++) {
            if (pozycje[i] != null) {
                suma += pozycje[i].obliczWartosc();
            }
        }
        return suma;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Zamowienie: \n");
        for (int i = 0; i < maxRozmiar; i++) {
            if (pozycje[i] != null) {
                stringBuilder.append(pozycje[i].toString() + "\n");
            }
        }
        stringBuilder.append("Razem: " + obliczWartosc() + " zł");
        return stringBuilder.toString();
    }
}
