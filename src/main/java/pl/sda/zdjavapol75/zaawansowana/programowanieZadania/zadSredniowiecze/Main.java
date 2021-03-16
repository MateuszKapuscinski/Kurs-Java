package pl.sda.zdjavapol75.zaawansowana.programowanieZadania.zadSredniowiecze;

public class Main {
    public static void main(String[] args) {
        Krol krol = new Krol("Wladyslaw");
        Zolnierz zolnierz = new Zolnierz("Zawisza Czarny");
        Mieszczanin mieszczanin = new Mieszczanin("Handlarz");
        Chlop chlop = new Chlop("Kowal");

        Miasto miasto = new Miasto(new Citizen[]{krol,zolnierz,mieszczanin,chlop});
        System.out.println("Ilosc osob, ktore moga glosowac: " + miasto.howManyCanVote());
        miasto.whoCanVote();

        Citizen[] pplWtabMogacyGlosowac = miasto.WhoCanVoteArrays();
        System.out.println("W tablicy z ludzmi mogacymi glosowac sa:");
        for (Citizen citizen : pplWtabMogacyGlosowac){
            System.out.println(citizen.getName());
        }
    }
}
