public class Pofi {

  public static String pofi(int n) {
    if (n % 4 == 0) {
      return "1";
    }
    
    if (n % 4 == 1) {
      return "i";
    }
    
    if (n % 4 == 2) {
      return "-1";
    }
    
    if (n % 4 == 3) {
      return "-i";
    }
    return "";
  }
    
}
