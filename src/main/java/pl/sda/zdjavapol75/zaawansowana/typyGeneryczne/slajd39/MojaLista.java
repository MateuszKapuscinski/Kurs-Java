package pl.sda.zdjavapol75.zaawansowana.typyGeneryczne.slajd39;

public class MojaLista<E>{

    private E[] tablicaElementow;

    public MojaLista(int n) {
        this.tablicaElementow = (E[]) new Object[n];
    }


}
