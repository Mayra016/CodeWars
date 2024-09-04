import java.util.Arrays;

class SumTwoSmallestNumbers{
  public static long sumTwoSmallestNumbers(final long [] numbers) {
    Arrays.sort(numbers);
    long result = 0L;
    byte times = 0;
    
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] > 0) {
        result += numbers[i];
        times++;
      }
      
      if (times == 2) {
        return result;
      }
    }
    return 0L; 
  }             
}
