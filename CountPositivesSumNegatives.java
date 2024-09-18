
public class CountPositivesSumNegatives
{
    public static int[] countPositivesSumNegatives(int[] input)
    {
      if (input == null || input.length == 0) {
        return new int[0];
      }
 
      int[] num = new int[2];
      int count = 0;
      int sum = 0;
      
      for (int i = 0; i < input.length; i ++) {
        if (input[i] > 0) {
          count++;
        }
        
        if (input[i] < 0) {
          sum += input[i];
        }
      }
      
      num[0] = count;
      num[1] = sum;
      
      return num;
    }
}
