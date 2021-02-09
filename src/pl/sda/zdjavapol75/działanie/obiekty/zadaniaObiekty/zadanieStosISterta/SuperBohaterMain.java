package pl.sda.zdjavapol75.działanie.obiekty.zadaniaObiekty.zadanieStosISterta;

public class SuperBohaterMain {

    public static void main(String[] args) {

        SuperBohater bohater1 = new SuperBohater("bohater1", "sila");
        SuperBohater bohater2 = new SuperBohater("bohater2", "wysoki");
        SuperBohater bohater3 = new SuperBohater("bohater3", "wielki");

         bohater1 = bohater2;
        bohater1=null;
        System.out.println(bohater2==null);

        bohater1=null;
        bohater2=bohater1;
        bohater1=bohater3;
        System.out.println(bohater1 == null);
        System.out.println(bohater2 == null);
        System.out.println(bohater3 == null);



    }
}

