package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.builder.zad3;

public class Main {
    public static void main(String[] args) {
        Computer computer = new ComputerBuilder()
                .withKartaGraficzna("NVIDIA")
                .withProcesor("N51")
                .build();
        System.out.println(computer);
    }
}
