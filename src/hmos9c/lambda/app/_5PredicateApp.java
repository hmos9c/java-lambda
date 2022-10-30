package hmos9c.lambda.app;

import java.util.function.Predicate;

public class _5PredicateApp {
  public static void main(String[] args) {

    Predicate<String> predicateCheckBlank = value -> value.isBlank();

    System.out.println(predicateCheckBlank.test(""));
    System.out.println(predicateCheckBlank.test("Sanas"));

  }
}
