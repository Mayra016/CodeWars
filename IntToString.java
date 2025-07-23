import java.util.HashMap;

public class IntToString
{
  public static String switchItUp(int number)
  {
    HashMap<Integer, String> nums = new HashMap<>();
    nums.put(0, "Zero");
    nums.put(1, "One");
    nums.put(2, "Two");
    nums.put(3, "Three");
    nums.put(4, "Four");
    nums.put(5, "Five");
    nums.put(6, "Six");
    nums.put(7, "Seven");
    nums.put(8, "Eight");
    nums.put(9, "Nine");
    
    return nums.get(number);
  }
}
