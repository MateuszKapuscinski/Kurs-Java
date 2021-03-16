package pl.sda.zdjavapol75.zaawansowana.programowanieZadania.zadSredniowiecze;

public class Mieszczanin extends Citizen{


    public Mieszczanin(String name) {
        super(name);
    }


    public boolean canVote() {
        return true;
    }
}
