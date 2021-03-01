package pl.sda.zdjavapol75.zaawansowana.wyjatki.zad1pdf;

public class CannotDivideByZeroException extends Throwable {

    public CannotDivideByZeroException() {
        super("Nie mozesz dzielic przez 0");
    }
}
