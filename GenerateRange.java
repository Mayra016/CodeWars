public class GenerateRange {
  public static int[] generateRange(int min, int max, int step) {

    int[] result = new int[(max - min)/step + 1];
    int index = 0;
    
    for (int i = min; i <= max; i+=step) {
      result[index] = i;
      index++;
    }
    
    return result;
  }
}
