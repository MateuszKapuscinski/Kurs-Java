package pl.sda.zdjavapol75.zaawansowana.dziedziczenie.zadSlajd88;

public class Main {
    public static void main(String[] args) {
        Samochod samochod = new Samochod("czerwony", "opel", 2010,true,0);
        Kabriolet kabriolet = new Kabriolet("czarny","bmw",2015,false,0);

        System.out.println(samochod.toString());
    }
}
