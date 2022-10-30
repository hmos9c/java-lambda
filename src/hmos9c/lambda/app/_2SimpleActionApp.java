package hmos9c.lambda.app;

import hmos9c.lambda._1SimpleAction;

public class _2SimpleActionApp {
  public static void main(String[] args) {

//    SimpleAction simpleAction1 = new SimpleAction() {
//      @Override
//      public String action(String name) {
//        return "Sanas";
//      }
//    };
//
//    System.out.println(simpleAction1.action("Sanas"));
//
//    SimpleAction simpleAction2 = (String name) -> {
//      return "Sanas";
//    };
//
//    System.out.println(simpleAction2.action("Sanas"));

    _1SimpleAction simpleAction1 = (String value) -> {
      return "Hello " + value;
    };

    _1SimpleAction simpleAction2 = (name) -> {
      return "Hello " + name;
    };

    _1SimpleAction simpleAction3 = (String value) -> "Hello " + value;

    _1SimpleAction simpleAction4 = (value) -> "Hello " + value;

    _1SimpleAction simpleAction5 = value -> "Hello " + value;

  }
}
