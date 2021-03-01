package pl.sda.zdjavapol75.zaawansowana.interfejsy.slajd23;

public class Student implements Comparable {
    protected String imie;
    protected String nazwisko;
    Integer numerIndeksu;


    public Student(String imie, String nazwisko, int numerIndeksu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerIndeksu = numerIndeksu;
    }

    @Override
    public String toString() {
        return  " numerIndeksu = " + numerIndeksu;
    }

    @Override
    public int compareTo(Object o) {
        Student student = (Student)o;
        return numerIndeksu.compareTo(student.numerIndeksu);
    }

}
