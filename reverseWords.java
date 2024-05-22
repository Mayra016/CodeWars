public class ReverseWords {
  public static String reversePhrase(final String original) {
    String[] words = original.split(" ");
    StringBuilder result = new StringBuilder();
    
    for (int i = 0; i < words.length; i++) {
      for (int x = words[i].length() - 1; i >= 0; i--) {
        result.append(words[i].charAt(x));
      }
      if (i != words.length - 1) {
        result.append(" ");
      }
      
    }
    return result.toString();
  }
}
