package hmos9c.lambda.app;

import hmos9c.lambda.util._7StringUtil;

import java.util.function.Function;
import java.util.function.Predicate;

public class _8MethodReferenceApp {
  public static void main(String[] args) {

    // Predicate<String> predicateIsLowerCase = value -> StringUtil.isLowerCase(value);
    Predicate<String> predicateIsLowerCase = _7StringUtil::isLowerCase;

    System.out.println(predicateIsLowerCase.test("sanas"));
    System.out.println(predicateIsLowerCase.test("Sanas"));

    // Method Reference di Parameter

    // Function<String, String> functionUpper = (String value) -> value.toUpperCase();
    Function<String, String> functionUpper = String::toUpperCase;

    System.out.println(functionUpper.apply("Sanas"));

  }

  public void run(){
    Predicate<String> predicateIsLowerCase = this::isLowerCase;

    System.out.println(predicateIsLowerCase.test("sanas"));
    System.out.println(predicateIsLowerCase.test("Sanas"));
  }

  public void run2(){
    _8MethodReferenceApp app = new _8MethodReferenceApp();

    Predicate<String> predicateIsLowerCase = app::isLowerCase;

    System.out.println(predicateIsLowerCase.test("sanas"));
    System.out.println(predicateIsLowerCase.test("Sanas"));
  }

  public boolean isLowerCase(String value) {
    for (var c : value.toCharArray()) {
      if (!Character.isLowerCase(c)) {
        return false;
      }
    }
    return true;
  }

}
