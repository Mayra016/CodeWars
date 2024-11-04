import java.util.Arrays;

public class CountingDuplicates {
  public static int duplicateCount(String text) {
    int repeat = 0;
    char[] letters = text.toLowerCase().toCharArray();
    char previousLetter = ' ';
    boolean already = false;
    
    Arrays.sort(letters);
    
    for (char letter : letters) {
      if (already == false && Character.toLowerCase(previousLetter) == Character.toLowerCase(letter)) {
        repeat++;
        already = true;
      } 
      if (already == true && Character.toLowerCase(previousLetter) != Character.toLowerCase(letter)) {
        already = false;
      }
      previousLetter = letter;
    }
    
    return repeat;
  }
}
