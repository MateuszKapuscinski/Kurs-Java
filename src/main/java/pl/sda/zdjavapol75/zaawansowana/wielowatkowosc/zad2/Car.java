package pl.sda.zdjavapol75.zaawansowana.wielowatkowosc.zad2;

import lombok.Data;

@Data
public class Car {
    public Car(String nazwaSamochodu, String typSamochodu) {
        this.nazwaSamochodu = nazwaSamochodu;
        this.typSamochodu = typSamochodu;
    }

    private String nazwaSamochodu;
    private String typSamochodu;


}
