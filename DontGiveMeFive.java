public class DontGiveMeFive
{
  public static int dontGiveMeFive(int start, int end)
  {
    int result = 0;
    for (int i = start; i <= end; i++) {
      if (!String.valueOf(i).contains("5")) {
        result++;
      }
    }
    return result;
  }
}
