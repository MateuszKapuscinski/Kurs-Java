package pl.sda.zdjavapol75.zaawansowana.wyjatki.zad1pdf;

public class Main {
    
    public static void main(String[] args){
        System.out.println(divide(5,1));
        System.out.println(divide(5,0));
    }

    public static double divide(int pierwsza, int druga){
        try {
             if (druga == 0) {
                 throw new CannotDivideByZeroException();
             }
        } catch (CannotDivideByZeroException e) {
            e.printStackTrace();
        }
        return pierwsza/druga;
    }
}
