public class Snail {
    public static boolean canSnailReachEnd(double length, double speed, double lengthIncreases) {
      int minutes = 0;
      
      if (speed <= lengthIncreases) {
        return false;
      }
      
      while (length > 0) {
        length -= speed;
        length += lengthIncreases;
        minutes++;
        
        if (minutes > 525600) {
          return false;
        }
      }

      return true;
    }
}
