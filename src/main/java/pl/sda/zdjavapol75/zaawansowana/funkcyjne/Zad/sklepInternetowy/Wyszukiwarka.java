package pl.sda.zdjavapol75.zaawansowana.funkcyjne.Zad.sklepInternetowy;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Wyszukiwarka {
    public static void main(String[] args) {
        List<Komputer> listaKomputerow = new ArrayList<>();
        listaKomputerow.add(new Komputer("Intel",9,6,32,600,5500));
        listaKomputerow.add(new Komputer("AMD",8,4,16,450,4350));
        listaKomputerow.add(new Komputer("Intel",10,8,32,650,7200));

        szukanyElement(listaKomputerow);

    }

    public static void szukanyElement (List<Komputer> listaKomputerow) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwe firme procesora");
        String podanaNazwa = scanner.nextLine();
        System.out.println("Podaj generacjeProcesora, ktora Cie interesuje");
        int podanaGeneracja = scanner.nextInt();
        System.out.println("Podaj iloscRamuKartyGraficznej, ktora Cie interesuje");
        int podanaIloscRamuKartyGraficznej = scanner.nextInt();
        System.out.println("Podaj iloscRamu, ktora Cie interesuje");
        int podanaIloscRamu= scanner.nextInt();
        System.out.println("Podaj mocZasilacza, jaka Cie interesuje");
        int podanaMocZasilacza= scanner.nextInt();
        System.out.println("Podaj cene");
        int podanaCenaKomputera= scanner.nextInt();

        listaKomputerow.stream()
                .filter(a -> a.getNazwaFirmyProcesora().equals(podanaNazwa))
                .filter(a -> a.getGeneracjaProcesora() == podanaGeneracja)
                .filter(a -> a.getIloscRamuKartyGraficznej() == podanaIloscRamuKartyGraficznej)
                .filter(a -> a.getIloscRamu() == podanaIloscRamu)
                .filter(a -> a.getMocZasilacza() == podanaMocZasilacza)
                .filter(a -> a.getCena() == podanaCenaKomputera)
                .forEach(System.out::println);
    }
}
