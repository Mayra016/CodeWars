public class SumSequence {
  public static int sequenceSum(int start, int end, int step) {
    int sum = 0;
    
    if (start > end) {
      return 0;
    }
    
    for (int i = start; i <= end; i += step) {
      sum += i;
    }
    
    return sum;
  }
}
