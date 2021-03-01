package pl.sda.zdjavapol75.zaawansowana.interfejsy.slajd23;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Student Marcin = new Student("Marcin", "Nowak", 3355);
        Student Jan = new Student("Jan", "Kowalski", 2266);
        Student Olek = new Student("Olek", "Stoch", 4323);

        Student[] tablicaStudentow = new Student[]{Marcin, Jan, Olek};
        System.out.println("Przed posortowaniem");
        wyswietlStudentow(tablicaStudentow);
        System.out.println("Po sortowaniu");
        Arrays.sort(tablicaStudentow);
        wyswietlStudentow(tablicaStudentow);
        System.out.println("Po posortowaniu odwrotnym");
        Arrays.sort(tablicaStudentow, Collections.reverseOrder());
        wyswietlStudentow(tablicaStudentow);

    }

    public static void wyswietlStudentow(Student[] tablicaStudentow) {
        for (Student studencik : tablicaStudentow) {
            System.out.println(studencik);
        }
    }
}
