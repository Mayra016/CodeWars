import java.util.Arrays;
import java.util.Collections;

"""
  Examples
["a", "a", "a", "b", "b"] ==> true  // 3x "a" and 2x "b"
["a", "b", "c", "b", "c"] ==> false // 1x "a", 2x "b" and 2x "c"
["a", "a", "a", "a", "a"] ==> false // 5x "a"

"""

public class Solution {
    public boolean checkThreeAndTwo(char[] chars) {
      Arrays.sort(chars);
      byte times = 0;
      Integer[] letters = new Integer[3];
      Arrays.fill(letters, 0);
      byte y = -1;
      
      for (int i = 0; i < chars.length; i++) { 
        if (i > 0 && chars[i] == chars[i - 1]) {
          times++;
        } else {
          times = 1;
          y++;
        }
        
        letters[y] = (int) times;
        
        if (times > 3) {
          return false;
        }
      }
      
      Arrays.sort(letters, Collections.reverseOrder());
      
      if (letters[0] == 3 && letters [1] == 2 || letters[0] == 2 && letters [1] == 3) {
        return true;
      } else {
        return false;
      }

    }
}
