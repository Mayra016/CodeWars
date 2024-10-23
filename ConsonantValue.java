import java.util.Arrays;

public class ConsonantValue {
    public static int solve(final String s) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int max = 0;
        int current = 0;
      
        for (int i = 0; i < s.length(); i++) {
          if (Arrays.binarySearch(vowels, s.charAt(i)) < 0) {
            current += Character.getNumericValue(s.charAt(i)) - 9;
          } else {
            if (i != 0 && Arrays.binarySearch(vowels, s.charAt(i)) >= 0 && current != 0) {
              max = Math.max(current, max);
              current = 0;
            }
          }
        } 
        max = Math.max(current, max);

        return max;
    }
}
