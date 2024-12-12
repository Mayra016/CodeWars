import java.util.Arrays;

public class Letters {
  
  public static String search(String line) {
    
    StringBuilder result = new StringBuilder();
    int[] charValues = new int[line.length()];
    int x = 0;
    
    for (int i = 0 ; i < line.length(); i++) {
      if (Character.isLetter(line.charAt(i))) {
        charValues[x] = Character.toLowerCase(line.charAt(i)) - '0';
        System.out.println(Character.toLowerCase(line.charAt(i)) + " : "  + charValues[x]);
        x++;
      }
    }
    
    Arrays.sort(charValues);
    
    for (int i = 0; i < 26; i++) {
      if (Arrays.binarySearch(charValues, 49 + i) >= 0) {
        result.append(1);
      } else {
        result.append(0);
      }
    }
    
    return result.toString();
  }
}
