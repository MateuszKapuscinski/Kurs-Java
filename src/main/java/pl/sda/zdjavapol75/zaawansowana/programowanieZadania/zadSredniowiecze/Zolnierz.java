package pl.sda.zdjavapol75.zaawansowana.programowanieZadania.zadSredniowiecze;

public class Zolnierz extends Citizen{


    public Zolnierz(String name) {
        super(name);
    }


    public boolean canVote() {
        return true;
    }
}
