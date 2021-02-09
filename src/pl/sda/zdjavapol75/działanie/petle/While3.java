package pl.sda.zdjavapol75.działanie.petle;

public class While3 {

    public static void main(String[] args) {
        //wypisuje 500 razy slowo cos
        int i = 0;
        while (true) {
            System.out.println("cos");
            if (i == 500) {
                break;
            }
            i++;
        }
    }
}