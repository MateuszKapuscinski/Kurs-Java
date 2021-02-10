package javazaawansowana.prezentacja.dziedziczenie.zadOOP.Zad2;

public class Student extends Person {
    private String typStudiow;
    private int rokStudiow;
    private double kosztStudiow;

    public Student(String name, String address,String typStudiow, int rokStudiow, double kosztStudiow) {
        this.name = name;
        this.address = address;
        this.typStudiow = typStudiow;
        this.rokStudiow = rokStudiow;
        this.kosztStudiow = kosztStudiow;
    }

    public String getTypStudiow() {
        return typStudiow;
    }

    public int getRokStudiow() {
        return rokStudiow;
    }

    public double getKosztStudiow() {
        return kosztStudiow;
    }

    public void setTypStudiow(String typStudiow) {
        this.typStudiow = typStudiow;
    }

    public void setRokStudiow(int rokStudiow) {
        this.rokStudiow = rokStudiow;
    }

    public void setKosztStudiow(double kosztStudiow) {
        this.kosztStudiow = kosztStudiow;
    }

    @Override
    public String toString() {
        return "Student{" +
                "typStudiow='" + typStudiow + '\'' +
                ", rokStudiow=" + rokStudiow +
                ", kosztStudiow=" + kosztStudiow +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
