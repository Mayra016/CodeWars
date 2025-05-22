public class DecTools {
  public static int Digits(long n) {
    int count = 0;
    
    for (char character : String.valueOf(n).toCharArray()) {
      if (Character.isDigit(character)) {
        count++;
      }
    }
    
    return count;
  }
}
