package hmos9c.lambda.app;

import java.util.function.Supplier;

public class _6SupplierApp {
  public static void main(String[] args) {

    Supplier<String> supplier = () -> "Sanas Febriyan";

    System.out.println(supplier.get());

  }
}
