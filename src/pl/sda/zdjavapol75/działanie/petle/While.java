package pl.sda.zdjavapol75.działanie.petle;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int a = scanner.nextInt();
        scanner.nextLine();
        int i = 0, suma = 0;
        while (i <= a) {
            suma = suma +i;

            i++;
        }
        System.out.println(suma);
    }
}


