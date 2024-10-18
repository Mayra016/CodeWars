import java.lang.Math.*;
import java.util.Arrays;

class Solution{
  public static int solve(String s){
    byte count = 0;
    char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    byte maxCount = 0;
    
    for (int i = 0; i < s.length(); i++) {
      if (Arrays.binarySearch(vowels, s.charAt(i)) >= 0) {
        count++;
      } else {
        maxCount = (byte) Math.max(count, maxCount);
        count = 0;
      }
    }
    
    maxCount = (byte) Math.max(count, maxCount);
    
    return (int) maxCount;
  }
}
