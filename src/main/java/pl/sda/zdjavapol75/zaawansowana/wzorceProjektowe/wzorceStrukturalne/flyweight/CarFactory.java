package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceStrukturalne.flyweight;

import java.util.Map;

public class CarFactory {
    private static final Map<String, Silnik> grupaSilników = Map.of(
            "Nowy", new Silnik(TypSilnika.DIESEL, "2.0"),
            "Stary", new Silnik(TypSilnika.DIESEL, "5.0"),
            "Jakis",new Silnik(TypSilnika.BENZYNA,"1.6")
    );
    public static Car stwórzSamochód(String rodzajSilnika, String marka, String kolor){
        switch(rodzajSilnika){
            case "Nowy":
            case "Stary":
            case "Jakis":
                return new Car(marka,grupaSilników.get(rodzajSilnika),kolor);

            default:
                throw new RuntimeException();
        }
    }
}
