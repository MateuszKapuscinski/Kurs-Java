package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceKonstrukcyjne.prototype.klonowanie;

public class Student implements Cloneable {
    private String name;
    private String surname;
    private String uczelnia;
    public Student(String name, String surname, String uczelnia) {
        this.name = name;
        this.surname = surname;
        this.uczelnia = uczelnia;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getUczelnia() {
        return uczelnia;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", uczelnia='" + uczelnia + '\'' +
                '}';
    }
    @Override
    protected Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}
