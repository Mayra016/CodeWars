import java.util.Arrays;

public class HighAndLowta {
  public static String highAndLow(String numbers) {
    String[] characters = numbers.split(" ");
    int[] nums = new int[characters.length];
    int i = 0;
    
    for (String character : characters) {
      nums[i] = Integer.valueOf(character);
      i++;
    }
    
    Arrays.sort(nums);
    return String.valueOf(nums[characters.length - 1]) + " " + String.valueOf(nums[0]);
  }
}
