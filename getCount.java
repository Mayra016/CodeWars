import java.util.Arrays;

public class Vowels {

  public static int getCount(String str) {
    int sum = 0;
    char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    
    for (char letter : str.toLowerCase().toCharArray()) {
      if (Arrays.binarySearch(vowels, letter) >= 0) {
        sum++;
      }
    }
    
    return sum;
  }
}
