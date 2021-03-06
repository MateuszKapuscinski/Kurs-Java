package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceStrukturalne.decorator;

public class PakietPlatinium implements MyjniaSamochodowa{
    private GoldPakiet goldPakiet;

    public PakietPlatinium(GoldPakiet goldPakiet) {
        this.goldPakiet = goldPakiet;
    }

    @Override
    public void umyjSamochod() {
        System.out.println("Pakiet platinium myjni samochodowej");
        goldPakiet.umyjSamochod();
    }
}
