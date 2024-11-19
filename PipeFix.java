public class Kata {
  public static int[] pipeFix(int[] numbers) {
    int[] result = new int[numbers[numbers.length - 1] - numbers[0] + 1];
    int index = 0;
    
    for (int i = numbers[0]; i <= numbers[numbers.length - 1]; i++) {
      System.out.println(i);
      result[index] = i;
      index++;
    }
    
    return result;
  }
}
