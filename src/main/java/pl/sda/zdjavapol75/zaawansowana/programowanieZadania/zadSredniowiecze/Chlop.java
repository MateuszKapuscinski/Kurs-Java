package pl.sda.zdjavapol75.zaawansowana.programowanieZadania.zadSredniowiecze;

public class Chlop extends Citizen{
    public Chlop(String name) {
        super(name);
    }


    public boolean canVote() {
        return false;
    }
}
