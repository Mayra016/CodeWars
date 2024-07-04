public class FindDivisors {

  public long numberOfDivisors(int n) {
    int divisors = 1;
    
    for (int i = 1; i < n; i++) {
      if (n % i == 0) {
        divisors++;
      }
    }
    
    return divisors;

  }

}
