package pl.sda.zdjavapol75.podstawy.petle;

import java.util.Scanner;

public class WhileZad2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int silnia = scanner.nextInt();
        int n = 1;
        int odp = 1;
        while (n <= silnia) {
            odp *= n;
            n++;

        }
        System.out.println("Silnia wynosi: " + odp);
    }

}
