package pl.sda.zdjavapol75.działanie.obiekty.zadaniaObiekty.zadDomObiekty;

import pl.sda.zdjavapol75.działanie.obiekty.zadaniaObiekty.zadDomObiekty.SalaLekcyjna;

public class SalaLekcyjnaMain {
    public static void main(String[] args) {
        SalaLekcyjna informatyczna = new SalaLekcyjna();
        informatyczna.nazwa = "informatyczna";
        informatyczna.numerSali = 2;
        informatyczna.wypiszDaneSali();

        SalaLekcyjna przyrodnicza = new SalaLekcyjna();
        przyrodnicza.nazwa = "przyrodnicza";
        przyrodnicza.numerSali = 11;
        przyrodnicza.wypiszDaneSali();

        SalaLekcyjna biologiczna = new SalaLekcyjna();
        biologiczna.nazwa = "biologiczna";
        biologiczna.numerSali = 15;
        biologiczna.wypiszDaneSali();

    }
}
