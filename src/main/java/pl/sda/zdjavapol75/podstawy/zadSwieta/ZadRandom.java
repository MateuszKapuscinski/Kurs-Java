package pl.sda.zdjavapol75.podstawy.zadSwieta;

public class ZadRandom {
    public static void main(String[] args) {
        // zad 16
         /*Random random = new Random();
        int a = random.nextInt();
        System.out.println("a = " + a);
        System.out.println("Czy liczba a > 100? tak/nie");
        Scanner scanner = new Scanner(System.in);
        String odp = scanner.nextLine();
        if (a > 100 && odp.equals("tak")) {
            System.out.println("Poprawna odpowiedź");
        } else if (a > 100 && odp.equals("nie")) {
            System.out.println("Niepoprawna odpowiedź");
        } else if (a < 100 && odp.equals("tak")) {
            System.out.println("Niepoprawna odpowiedź");
        } else  {
            System.out.println("Poprawna odpowiedź");
        } */

        // zad 13 a)
        /*System.out.println("Podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Random r = new Random();
        for(int i =0; i<n; i++){
            int b = r.nextInt();
            System.out.println(b);
        }*/

        // zad 13 b)
        /*System.out.println("Podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            double b = r.nextDouble() * 100;
            System.out.println(b);
        } */

        // zad 13 c)
        /* System.out.println("Podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            boolean b = r.nextBoolean();
            System.out.println(b);
        } */

        //zad 13 d)
          /*System.out.println("Podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Podaj poczatek zakresu");
        int poczatekZakresu = scanner.nextInt();
        System.out.println("Podaj koniec zakresu");
        int koniecZakresu = scanner.nextInt();
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int b = r.nextInt(koniecZakresu - poczatekZakresu) + poczatekZakresu;
            System.out.println(b);
        }*/

        //zad 13 e)
         /*System.out.println("Podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Podaj poczatek zakresu");
        double poczatekZakresu = scanner.nextDouble();
        System.out.println("Podaj koniec zakresu");
        double koniecZakresu = scanner.nextDouble();
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            double b = poczatekZakresu + (koniecZakresu - poczatekZakresu) * r.nextDouble();
            System.out.println(b);
        } */

    }
}