package pl.sda.zdjavapol75.zaawansowana.programowanieZadania.zadKomputer;

public class Main {
    public static void main(String[] args) {
        Komputer komputer = new Komputer(100, "Intel", TypProcesora.WIELORDZENIOWY);
        Komputer komputer2 = new Komputer(200, "AMD", TypProcesora.WIELORDZENIOWY);
        Komputer komputer3 = new Komputer(300, "SAMSUNG", TypProcesora.JEDNORDZENIOWY);

        Laptop laptop = new Laptop(100, "AMD", TypProcesora.WIELORDZENIOWY, 15.6, Boolean.TRUE);
        Laptop laptop2 = new Laptop(200, "Intel", TypProcesora.JEDNORDZENIOWY, 17.6, Boolean.FALSE);
        Laptop laptop3 = new Laptop(300, "Huawei", TypProcesora.JEDNORDZENIOWY, 18.6, Boolean.TRUE);

        Komputer[] tablicaKomputerow = {komputer, komputer2, komputer3, laptop, laptop2, laptop3};
        int i = 0;
        while (i < tablicaKomputerow.length) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Sprzet w tablicy pod indeksem " + i + ": \n"
                    + "Potrzbena moc: " + tablicaKomputerow[i].getPotrzebnaMoc() + " "
                    + "Producent: " + tablicaKomputerow[i].getProducent() + " "
                    + "Typ: " + tablicaKomputerow[i].getTypProcesora());
            if (tablicaKomputerow[i] instanceof Laptop) {
                stringBuilder.append(" Wielkosc matrycy: " + ((Laptop) tablicaKomputerow[i]).getWielkoscMatrycy());
            }
            System.out.println(stringBuilder.toString());
            i++;
        }
    }
}
