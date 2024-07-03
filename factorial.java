public class Factorial {

  public int factorial(int n) {
    int result = 1;

    // Throw exceptions to prevent the output to be greater than an int limit
    if (n < 0) {
      throw new IllegalArgumentException("Negative numbers are not allowed");
    }
    
    if (n > 12) {
      throw new IllegalArgumentException("Numbers greater than 12 are not allowed");
    }
    
    for (int i = n; i > 0; i--) {
      result *= i;
    }
    return result;
  }
}
