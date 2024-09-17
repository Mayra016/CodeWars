import java.util.Arrays;
import java.util.Collections;

public class Sequence{

  public static int[] reverse(int n){
    Integer[] nums = new Integer[n];
    int index = 0;
    
    for (int i = n; i > 0; i--) {
      nums[index] = i;
      index++;
    }
    
    Arrays.sort(nums, Collections.reverseOrder());
    
    return  Arrays.stream(nums).mapToInt(Integer::intValue).toArray();
  }

}
