package pl.sda.zdjavapol75.zaawansowana.wielowatkowosc.zad2;

public class Bridge {

    public synchronized void driveThrough (Car car) {
        // ta metoda nie wpusci 2 watkow na raz
        System.out.println("jedzie " + car);
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("przejechal " + car);
    }
}
