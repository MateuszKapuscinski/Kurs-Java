package pl.sda.zdjavapol75.zaawansowana.polimorfizm.zadslajd119;

public class Trapez extends Figura {
    double bokA;
    double bokB;
    double wysokoscTrapezu;


    public Trapez(double bokA, double bokB, double wysokoscTrapezu) {
        this.bokA = bokA;
        this.bokB = bokB;
        this.wysokoscTrapezu = wysokoscTrapezu;

    }


    @Override
    public double obliczPole() {
        return ((bokA + bokB) * wysokoscTrapezu)/2 ;
    }
}
