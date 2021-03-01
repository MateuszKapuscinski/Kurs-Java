package pl.sda.zdjavapol75.zaawansowana.dziedziczenie.zadOOP.Zad2;

public class Main {
    public static void main(String[] args) {
        Person student = new Student("John","ul.Chopena","informatyka",1,2550.60);
        Person staff = new Staff("Bazy danych", 6300.50);
        System.out.println(student);
        System.out.println(staff);
    }
}

