package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceKonstrukcyjne.singleton.eager.zad2;

public class Main {
    public static void main(String[] args) {
        Servers amazonServers = Servers.INSTANCE;
        Servers googleServers = Servers.INSTANCE;

        String amazon1 = "HTTP_AMAZON_1";
        String amazon2 = "HTTPS_AMAZON_1";
        String amazon3 = "HAMAZON_1";
        String googl1 = "HTTP_GOOGLE_1";

        amazonServers.dodaj(amazon1);
        amazonServers.dodaj(amazon2);
        amazonServers.dodaj(amazon3);
        googleServers.dodaj(googl1);
        System.out.println(amazonServers.getHttpList());


    }
}
