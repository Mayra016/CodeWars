import java.util.Arrays;

/*
Task
You will be given an array of numbers. You have to sort the odd numbers in ascending order while leaving the even numbers at their original positions.

Examples
[7, 1]  =>  [1, 7]
[5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]
*/

public class SortArray {
  public static int[] sortArray(int[] array) {
    int[] nums = new int[array.length];
    int y = 0;
    
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 != 0) {
        nums[y] = array[i];
        y++;
      }
    }
    
    y = 0;
    Arrays.sort(nums);
    
    for (int x = 0; x < array.length; x++) {
      if (array[x] % 2 != 0) {
        while(nums[y] == 0) {
          y++;
        }
        array[x] = nums[y];
        y++;
      }
    }    
    
    return array;
  }
}
