public class Grow{

  public static int grow(int[] x){
    int result = 1;
    
    for (int num : x) {
      result *= num;
    }
    
    return result;
  }

}
