public class SmallEnough
{
  public static boolean smallEnough(int[] a, int limit)
  {
    for (int num : a) {
      if (num > limit) {
        return false;
      }
    }
    return true;
  }
}
