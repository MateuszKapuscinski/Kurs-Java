package pl.sda.zdjavapol75.zaawansowana.kolekcjeZadania.pdfZad1;

public class Main {
    public static void main(String[] args) {

        SDAArrayList<String> stringList = new SDAArrayList<>();
        stringList.add("Michał");
        stringList.add("Michał1");
        stringList.add("Michał2");
        stringList.add("Michał3");
        stringList.add("Michał4");
        stringList.add("Michał5");

        stringList.display();
        stringList.remove(4);
        stringList.display();
    }
}
