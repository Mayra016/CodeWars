public class SequenceSum {
      	public static int[] sumOfN(int n) {
      
              int[] result = new int[Math.abs(n) + 1];
              
              for (int i = 0; i <= Math.abs(n); i++) {
                  if (i == 0) {
                      result[i] = i;
                  } else {
                      result[i] = n > 0 ? result[i - 1] + i : result[i - 1] -Math.abs(i);
                  }     
              }
              
              return result; 
        }
}  
