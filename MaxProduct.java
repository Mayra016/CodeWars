import java.util.Arrays;

public class MaxProduct {
  public int adjacentElementsProduct(int[] array) {
    int result = Integer.MIN_VALUE;
    
    for (int i = 0; i < array.length - 1; i++) {
      result = Math.max(array[i] * array[i + 1], result);
    }
    
    return result;
  }
}
