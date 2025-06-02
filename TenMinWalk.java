public class TenMinWalk {
  public static boolean isValid(char[] walk) {
    int y = 0;
    int x = 0;
    
    if (walk.length != 10) {
      return false;
    }
    
    for (char step : walk) {
      if (step == 'n') {
        y++;
      }
      if (step == 's') {
        y--;
      }
      if (step == 'e') {
        x++;
      }
      if (step == 'w') {
        x--;
      }
    }
    
    return x == 0 && y == 0 ? true : false;
  }
}
