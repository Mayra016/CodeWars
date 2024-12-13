public class LongestWord {
  public static String longestWord(String wordString) {
    String[] words = wordString.split(" ");
    String word = "";
    
    for (int i = 0; i < words.length; i++) {
      if (words[i].length() >= word.length()) {
        word = words[i];
      }
    }
    
    return word;
  }
}
