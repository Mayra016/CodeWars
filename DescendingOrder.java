import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
  public static int sortDesc(final int num) {
        char[] digits = String.valueOf(num).toCharArray();
        Character[] newDigits = new Character[digits.length];
    
        for (int i = 0; i < digits.length; i++) {
          newDigits[i] = digits[i];
        }  
    
        Arrays.sort(newDigits, Collections.reverseOrder());
    
        StringBuilder result = new StringBuilder();
    
        for (Character digit : newDigits) {
          result.append(digit);
        }
    
        return Integer.parseInt(result.toString());
    
  }
}
