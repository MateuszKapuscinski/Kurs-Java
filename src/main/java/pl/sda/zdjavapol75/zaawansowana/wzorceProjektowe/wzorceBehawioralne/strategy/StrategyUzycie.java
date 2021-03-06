package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceBehawioralne.strategy;

public class StrategyUzycie {
    public static void main(String[] args) {
        Payment wybranaFormaPlatnosci = WyborPlatnosci.wybierzSposobPlatnosci(SposobPlatnosc.BANK);
        //wybranaFormaPlatnosci.oplac(100);

        Payment wybranaFormaPlatnosci2 = WyborPlatnosci.wybierzSposobPlatnosci(SposobPlatnosc.BITCOIN);
        wybranaFormaPlatnosci2.oplac(1550);
    }
}
