package pl.sda.zdjavapol75.zaawansowana.wielowatkowosc.zad1;

public class Main {
    public static void main(String[] args) {

        thread.start();
        thread2.start();
    }

    static Thread thread = new Thread(new Runnable() {
        @Override
        public void run() {
            for (int i = 1000; i < 2000; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    });
    static Thread thread2 = new Thread(new Runnable() {
        @Override
        public void run() {
            for (int i = 14300; i < 17800; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    });


}
