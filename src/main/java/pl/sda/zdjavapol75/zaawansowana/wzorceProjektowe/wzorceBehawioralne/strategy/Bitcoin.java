package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceBehawioralne.strategy;

public class Bitcoin implements Payment{
    @Override
    public void oplac(double cena) {
        System.out.println("Oplacone przez bitcoina: " + cena);
    }
}
