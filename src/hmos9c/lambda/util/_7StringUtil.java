package hmos9c.lambda.util;

public class _7StringUtil {

  public static boolean isLowerCase(String value) {
    for (var c : value.toCharArray()) {
      if (!Character.isLowerCase(c)) {
        return false;
      }
    }
    return true;
  }

}
