public class DoubleEveryOne {
  public static int[] doubleEveryOther(int[] a) {
    byte x = 0;
    for (int i = 0; i < a.length; i++) {
      if (x == 1) {
        a[i]*=2;
        x = 0;
      } else {
        x++;
      }     
    }
    return a;
  }
}
