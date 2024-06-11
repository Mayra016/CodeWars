import java.util.*;

class sortListCaseInsensitive {

  public static List<String> sort(List<String> textbooks) {
    Collections.sort(textbooks, String.CASE_INSENSITIVE_ORDER);
    return textbooks;
  }
}
