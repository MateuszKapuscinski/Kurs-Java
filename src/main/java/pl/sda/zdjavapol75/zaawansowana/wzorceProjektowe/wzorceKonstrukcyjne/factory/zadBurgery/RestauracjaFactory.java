package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceKonstrukcyjne.factory.zadBurgery;

public class RestauracjaFactory {


    public static Restauracja wybierzRestauracje(TypRestauracji typRestauracji){
        switch(typRestauracji){
            case Mc_Donald:
                return new McDonald();
            case Kfc:
                return new KFC();
            case SUBWAY:
                return new Subway();
            default:
                System.out.println("Dana restauracja nie istnieje.");
                throw new RuntimeException();
        }
    }
}
