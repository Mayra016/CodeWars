import java.lang.Math;
public class FindOddCubes {
 
  public static int cubeOdd(int arr[]) {
    int sum = 0;
    
    for (int num : arr) {
      double num3 = Math.pow(num, 3);
      
      if (num3 % 2 != 0) {
        sum += num3;
      }
    }
    
    return sum;
  }
}
