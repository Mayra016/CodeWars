public class FuelLeft {
  
  public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
    if (fuelLeft * mpg - distanceToPump >= 0) {
      return true;
    } else {
      return false;
    }
  }
  
}
