package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceBehawioralne.strategy;

public class Paypal implements Payment{
    @Override
    public void oplac(double cena) {
        System.out.println("Oplacone przez portal paylpal: " + cena);
    }
}
