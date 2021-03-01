package pl.sda.zdjavapol75.zaawansowana.wielowatkowosc.zad4;

import lombok.SneakyThrows;

public class Main {
    public static void main(String[] args) {
        KontoBankowe kontoBankowe = new KontoBankowe(100);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    kontoBankowe.pobranieSrodkowZKonta(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                kontoBankowe.zrobPrzelewNaKonto(200);
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(8000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                kontoBankowe.zrobPrzelewNaKonto(200);
            }
        });

        thread.start();
        thread2.start();
        thread3.start();
    }
}

class KontoBankowe {
    private double saldo;

    public KontoBankowe(double saldo) {
        this.saldo = saldo;
    }

    public synchronized void zrobPrzelewNaKonto(double kwota) {
        saldo += kwota;
        notify();
        System.out.println("przelew przychodzacy : " + kwota + " saldo " + saldo);
    }

    public synchronized void pobranieSrodkowZKonta(double kwota) throws InterruptedException {
        while (saldo < kwota) {
            System.out.println("Masz za malo srodkow na koncie");
            wait();
        }
        saldo -= kwota;
        System.out.println("zabrane srodki z konta : " + kwota + " saldo: " + saldo);
    }

}
