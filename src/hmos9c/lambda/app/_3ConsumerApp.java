package hmos9c.lambda.app;

import java.util.function.Consumer;

public class _3ConsumerApp {
  public static void main(String[] args) {

    Consumer<String> consumer = value -> System.out.println(value);

    consumer.accept("Sanas Febriyan");

  }
}
