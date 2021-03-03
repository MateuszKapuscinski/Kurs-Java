package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceKonstrukcyjne.factory.zadBurgery;

import java.util.List;

public class Burger {
    private BurgerTyp name;
    private List<Skladniki> skladniki;
    private double cena;
    private Waga waga;
    private Burger(BurgerTyp name,List<Skladniki> skladniki, double cena, Waga waga) {
        this.name = name;
        this.skladniki = skladniki;
        this.cena = cena;
        this.waga = waga;
    }

    public BurgerTyp getName() {
        return name;
    }

    public List<Skladniki> getSkladniki() {
        return skladniki;
    }
    public double getCena() {
        return cena;
    }
    public Waga getWaga() {
        return waga;
    }

    @Override
    public String toString() {
        return
                 name + ":" +
                " skladniki=" + skladniki +
                " cena=" + cena +
                " waga=" + waga +
                '}';
    }

    public static class Builder{
        private BurgerTyp name;
        private List<Skladniki> skladniki;
        private double cena;
        private Waga waga;

        public Builder withNameTyp(BurgerTyp name) {
            this.name = name;
            return this;
        }
        public Builder withSkladniki(List<Skladniki> skladniki){
            this.skladniki = skladniki;
            return this;
        }
        public Builder withCena(double cena){
            this.cena = cena;
            return this;
        }
        public Builder withWaga(Waga waga){
            this.waga = waga;
            return this;
        }
        public Burger stwórz(){
            return new Burger(name,skladniki, cena, waga);
        }
    }
}
