package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceStrukturalne.bridge;

import java.util.List;

public class PiwoZakup implements DrinkZakup{

    @Override
    public Drink kup(List<Dodatki> dodatki) {
        return new Piwo(dodatki);
    }
}
