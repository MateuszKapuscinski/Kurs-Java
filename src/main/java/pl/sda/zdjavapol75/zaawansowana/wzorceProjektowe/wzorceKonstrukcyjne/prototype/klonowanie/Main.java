package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceKonstrukcyjne.prototype.klonowanie;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student("Andrzej", "Pospieszny", "PG");
        Student student1 = student.clone();
        System.out.println("Student numer 1: " + student + "\n");
        System.out.println("Klon student: " + student1 + "\n");
    }
}
