public class NumberFun {
  public static long findNextSquare(long sq) {
      double num = Math.sqrt(sq);
    
      if (num % 1 != 0) {
        return -1;
      }
    
      return (long) Math.pow(num + 1, 2); 
  }
}
