package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceStrukturalne.decorator;

public class SilverPakiet implements MyjniaSamochodowa{
    private PakietStantardowy pakietStantardowy;
    public SilverPakiet(PakietStantardowy pakietStantardowy) {
        this.pakietStantardowy = pakietStantardowy;
    }
    @Override
    public void umyjSamochod() {
        System.out.println("Pakiet silver mycia samochodu");
        pakietStantardowy.umyjSamochod();
    }
}
