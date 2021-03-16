package pl.sda.zdjavapol75.zaawansowana.programowanieZadania.zadSredniowiecze;

public class Krol extends Citizen{

    public Krol(String name) {
        super(name);
    }


    public boolean canVote() {
        return false;
    }
}
