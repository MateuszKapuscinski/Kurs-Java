package pl.sda.zdjavapol75.zaawansowana.programowanieZadania.zadSredniowiecze;

public abstract class Citizen {
   protected String name;

    protected Citizen(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    public abstract boolean canVote();
}
