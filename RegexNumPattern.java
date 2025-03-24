import java.util.regex.*;

public class RegexNumPattern {

  public static boolean validatePin(String pin) {
    String REGEX = "^(\\d{4}|\\d{6})$";
    
    return pin.matches(REGEX);
  }

}
