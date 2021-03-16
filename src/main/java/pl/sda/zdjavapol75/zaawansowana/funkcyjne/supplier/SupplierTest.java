package pl.sda.zdjavapol75.zaawansowana.funkcyjne.supplier;

import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        getValue( () -> "supplier Test!" );
    }

    static void getValue(Supplier<String> supplier){
        System.out.println(supplier.get());
    }
}
