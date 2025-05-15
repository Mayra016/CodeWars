public class SubstringCount {
  public static int substringCount(String fullText, String search) {
    int initial = fullText.length();
    
    fullText = fullText.replaceAll(search, "");
    
    return (initial - fullText.length()) / search.length();
  }
}
