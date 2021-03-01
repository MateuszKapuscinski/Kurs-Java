package pl.sda.zdjavapol75.zaawansowana.kolekcjeZadania.pdfZad1;

import java.util.Arrays;

public class SDAArrayList<T>  {

    private static final int INITIAL_SIZE = 3;
    private T[] element;
    private int size = 0;

    public SDAArrayList() {
        element = (T[]) new Object[INITIAL_SIZE];
    }

    public SDAArrayList(int initialSize) {
        element = (T[]) new Object[INITIAL_SIZE];
    }

    public boolean add(T elementToAdd) {
        if (element.length == size) {
            doubleCapacity();
        }
        element[size++] = elementToAdd;
        return true;
    }

    private void doubleCapacity() {
        element = Arrays.copyOf(element,element.length * 2);
    }

    public T get(int index) {
        return (T) element[index];
    }

    public T remove(int index) {
    T temp = element[index];
        for (int i = index; i < size -1; i++) {
            element[i] = element[i+1];
        }
        size--;
        return temp;
    }

    public void display () {
        for (int i = 0; i < size; i++) {
            System.out.println(element[i]);
        }
    }
}

