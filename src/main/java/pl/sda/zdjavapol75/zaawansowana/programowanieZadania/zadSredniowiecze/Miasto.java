package pl.sda.zdjavapol75.zaawansowana.programowanieZadania.zadSredniowiecze;


public class Miasto {
    private Citizen[] tablicaCitizenow;

    public Miasto(Citizen[] tablicaCitizenow) {
        this.tablicaCitizenow = tablicaCitizenow;
    }

    public int howManyCanVote() {
        int counter = 0;
        for (Citizen citizen : this.tablicaCitizenow){
            if (citizen.canVote()) {
                counter++;
            }
        }
        return counter;
    }

    public void whoCanVote () {
        for (Citizen citizen : tablicaCitizenow) {
            if (citizen.canVote()) {
                System.out.println(citizen.getName());
            }
        }
    }

    public Citizen[] WhoCanVoteArrays () {
        int liczbaGlosujacych = howManyCanVote();
        int counter = 0;

        Citizen[] tabGlosujacych = new Citizen[liczbaGlosujacych];
        for (Citizen citizen : this.tablicaCitizenow){
            if (citizen.canVote()){
                tabGlosujacych[counter] = citizen;
                counter++;
            }
        }
        return tabGlosujacych;
    }
}
