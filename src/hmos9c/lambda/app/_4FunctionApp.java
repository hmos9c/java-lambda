package hmos9c.lambda.app;

import java.util.function.Function;

public class _4FunctionApp {
  public static void main(String[] args) {

    Function<String, Integer> functionLength = value -> value.length();

    System.out.println(functionLength.apply("Sanas"));

  }
}
