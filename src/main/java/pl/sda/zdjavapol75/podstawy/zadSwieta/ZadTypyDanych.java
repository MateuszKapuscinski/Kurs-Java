package pl.sda.zdjavapol75.podstawy.zadSwieta;

public class ZadTypyDanych {

    public static void main(String[] args) {
        // zad 5
        /* boolean jest_cieplo = true;
        boolean wieje_wiatr = true;
        boolean swieci_slonce = true;

        boolean ubieram_sie_cieplo  = !jest_cieplo || wieje_wiatr;


        boolean biore_parasol = !swieci_slonce && !wieje_wiatr;
        boolean ubieram_kurtke = wieje_wiatr && !swieci_slonce && !jest_cieplo; */


        // zad 6 i 7
         /* int waga = 80;
        int wzrost = 160;
        int wiek = 11;

        if (waga < 180 && wzrost > 150) {
            System.out.println("Możesz wejść, masz dobrą wagę i wzrost");
        } else if (wiek < 10 || wiek > 80) {
            System.out.println("Nie możesz wejść z powodu wieku");
        }
        if (wzrost > 150 || wzrost < 220) {
            System.out.println("Masz dobry wzrost możesz wejść");
        } */

        // zad 9
         /*Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj temperature w stopniach celcjusza:");
        double temperatura = scanner.nextDouble();
        System.out.println("To będzie " + (temperatura * 1.8 + 32) + " w stopniach fahrenheita"); */


        //zad 11
        /*double dochod = 256887.25;
        if (dochod < 85528) {
            System.out.println("Musisz zaplacic " + (dochod * 0.18 - 556.02) +"zl podatku");
        } else if (dochod > 85528) {
            System.out.println("Musisz zaplacic " + (0.32 *(dochod - 85528) - (14839.02)) + " zl podatku");
        } */

        //zad 12

          /*Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wage");
        int waga = scanner.nextInt();
        if (waga < 180) {
            System.out.println("Możesz wejść, masz dobrą wagę");
        } else if (waga > 180) {
            System.out.println("Masz za dużą wagę, nie możesz wejść");
        }

        System.out.println("Podaj wiek");
        int wiek = scanner.nextInt();
        if (wiek > 10 && wiek < 80) {
            System.out.println("Możesz wejść");
        } else if (wiek < 10 || wiek > 80) {
            System.out.println("Nie możesz wejść z powodu wieku");
        }
        System.out.println("Podaj wzrost");
        int wzrost = scanner.nextInt();
        if (wzrost > 150 && wzrost < 220) {
            System.out.println("Masz dobry wzrost, możesz wejść");
        } else if (wzrost < 150 || wzrost > 220) {
            System.out.println("Nie możesz wejść z powodu wzrostu");
        } */

        // zad 15
        /*char i;
        for (i = 'A'; i < 'Z'; i++)  {
            System.out.println(i);
        } */


    }
}
