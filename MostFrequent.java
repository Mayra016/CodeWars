import java.util.Arrays;

public class MostFrequent {
  public static int mostFrequentItemCount(int[] collection) {
    
    if (collection.length == 0) {
      return 0;
    }
    
    Arrays.sort(collection);
    
    int count = 1;
    int result = 0;
    int previousNum = collection[0];
    
    for (int i = 1; i < collection.length; i++) {
      if (collection[i] == previousNum) {
        count++;
      } else {
        previousNum = collection[i];
        result = Math.max(count, result);
        count = 1;
      }
    }
    
    result = Math.max(count, result);
    
    return result;
    
  }
}
