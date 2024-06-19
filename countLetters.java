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
}
