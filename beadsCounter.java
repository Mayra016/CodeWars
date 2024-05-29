/*
 Each blue must be followed by two reds. The last one can be blue.
*/


public class BeadsCounter {
    public static int countRedBeads(final int nBlue) {
      int sum = 0;
      
      for (int i = 0; i < nBlue; i++) {
        if (i < nBlue - 1) {
          sum += 2;
        }
      }
      return sum;
    }
}
