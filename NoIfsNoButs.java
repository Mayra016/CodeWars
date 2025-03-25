public class NoIfsNoButs {
  
    public static String noIfsNoButs(int a, int b) {     
        if (a == b) {
          return a + " is equal to " + b;
        }
        return a < b ? a + " is smaller than " + b : a + " is greater than " + b;
    }
}
