package pl.sda.zdjavapol75.zaawansowana.io.zadMecze;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collection;

public class Helper {
    public static void saveToFile(String fileName, Collection<?> data) throws IOException {
        Path path = Paths.get(fileName);
        /*
            TODO spytac uzytkownika czy chce nadpisac plik i wykonac odpowiednie operacje
        */
        while (Files.exists(path)) {
            System.out.println("Taki plik juz istnieje! Podaj inna nazwe!");
            fileName = Main.getFileName();
            path = Paths.get(fileName);
        }
        Files.createFile(path);

        for (Object o : data) {
            Files.write(path, (o.toString()+"\n").getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
        }
    }
}
