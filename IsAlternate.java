import java.util.Arrays;

public class IsAlternate {
    public static boolean isAlt(String word) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int index = 0;
        int indexConsonants = 0;
      
        for (int i = 0; i < word.length(); i++) {
          if (Arrays.binarySearch(vowels, word.charAt(i)) >= 0) {
            index = i;
          } else {
            indexConsonants = i;
          }
          if (indexConsonants - index > 1 || indexConsonants - index < -1) {
            return false;
          }
          if (i < word.length() - 1 && Arrays.binarySearch(vowels, word.charAt(i)) >= 0 && Arrays.binarySearch(vowels, word.charAt(i + 1)) >= 0) {
            return false;
          }
          if (i < word.length() - 1 && Arrays.binarySearch(vowels, word.charAt(i)) < 0 && Arrays.binarySearch(vowels, word.charAt(i + 1)) < 0) {
            return false;
          }
        }
      
        return true;
    }
}
