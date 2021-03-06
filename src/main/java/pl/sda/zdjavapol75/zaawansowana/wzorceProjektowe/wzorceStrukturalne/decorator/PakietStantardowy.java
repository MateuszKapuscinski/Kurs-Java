package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceStrukturalne.decorator;

public class PakietStantardowy implements MyjniaSamochodowa{
    @Override
    public void umyjSamochod() {
        System.out.println("Standardowe mycie samochodu");
    }
}
