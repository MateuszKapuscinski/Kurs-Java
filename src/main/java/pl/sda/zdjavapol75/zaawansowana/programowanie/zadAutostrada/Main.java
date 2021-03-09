package pl.sda.zdjavapol75.zaawansowana.programowanie.zadAutostrada;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Highway highway = new Highway();
        String polecenie;
        do {
            System.out.println("Podaj polecenie:");
            polecenie = scanner.nextLine();
            String[] words = polecenie.split(" ");
            if (words.length >= 2) {
                if (polecenie.toLowerCase().matches("wyjazd\\s.*")) {
                    highway.vehicleLeave(words[1]);
                } else if (polecenie.toLowerCase().matches("wjazd\\s.*")) {
                    highway.vehicleEntry(words[1], CarType.valueOf(words[2]));
                } else if (polecenie.toLowerCase().matches("sprawdz\\s.*")) {
                    highway.searchVehicle(words[1]);
                }
            }

        }
        while (!polecenie.equalsIgnoreCase("Stop"));

    }
}

