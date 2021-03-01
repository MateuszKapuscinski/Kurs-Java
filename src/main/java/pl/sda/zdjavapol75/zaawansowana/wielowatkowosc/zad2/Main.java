package pl.sda.zdjavapol75.zaawansowana.wielowatkowosc.zad2;

public class Main {
    public static void main(String[] args) {


         Car car1 = new Car("BMW", "E35");
         Car car2 = new Car("Opel", "Astra");

        Bridge bridge = new Bridge();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                bridge.driveThrough(car1);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                bridge.driveThrough(car2);
            }
        });

        thread.start();
        thread2.start();
    }
}
