package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceStrukturalne.decorator;

public class DekoratorUzycie {
    public static void main(String[] args) {
/*        PakietStantardowy pakietStantardowy = new PakietStantardowy();
        SilverPakiet pakietSilver = new SilverPakiet(pakietStantardowy);
        GoldPakiet pakietGold = new GoldPakiet(pakietSilver);
        pakietGold.umyjSamochod();*/

        PakietPlatinium pakietPlatinium = new PakietPlatinium(new GoldPakiet(new SilverPakiet(new PakietStantardowy())));
        pakietPlatinium.umyjSamochod();
    }
}
