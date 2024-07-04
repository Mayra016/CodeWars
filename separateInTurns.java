public class SeparateInTurns{
  public static int[] beggars(int[] values, int n) {
    if (n == 0) {
      return new int[0];
    }
    
    int[] persons = new int[n];
    int num = 0;
    
    for (int i = 0; i < values.length; i++) {
      persons[num] += values[i];
      if (num < n - 1) {
        num++;
      } else {
        num = 0;
      }
    }
    
    return persons;
  }
}
