package pl.sda.zdjavapol75.zaawansowana.programowanie.zadAutostrada;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public  class VehicleInfo {
    private final String registrationNumber;
    private final CarType carType;
    private final LocalDateTime entryTime;

}
