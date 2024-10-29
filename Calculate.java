public class Calculate {
  public static String bmi(double weight, double height) {
    double result = weight / Math.pow(height, 2);
    
    if (result <= 18.5) {
      return "Underweight";
    }
    
    if (result <= 25) {
      return "Normal";
    }
    
    if (result <= 30) {
      return "Overweight";
    }
    
    return "Obese";
  }
}
