import java.util.Arrays;

public class Largest {
  
   public static int[] largest(int n, int[] arr) {
     Arrays.sort(arr);
     int[] result = new int[n];
     int x = 0;
     
     if (arr.length <= n) {
       return arr;
     }
     
     for (int i = arr.length - n; i < arr.length; i++) {
       result[x] = arr[i];
       x++;
     }
     
     return result;
   }
}
