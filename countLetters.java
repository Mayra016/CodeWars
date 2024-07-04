import static org.apache.commons.lang3.StringUtils.countMatches;

public class countLetters {
  public static int strCount(String str, char letter) {
    int count = 0;
    
    for ( char letterWord : str.toCharArray()) {
      if (letterWord == letter) {
        count++;
      }
    }
    
    return count;
  }

  public static int countCharOccurrences2(String s, char c) {
      return countMatches(s, c);
  }
}   
