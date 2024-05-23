import java.lang.Math;

public class PowersOfTwo.{
  public static long[] powersOfTwo(int n){
        long[] results = new long[n + 1];
        
        for (int i = 0; i <= n; i++) {
          results[i] = (long) Math.pow(2, i);
        }
    
        return results;
  }
}
