public class CaffeineBuzz {
  public static String caffeineBuzz(int n) {
    if (n % 3 == 0) { 
      if (n % 4 == 0) {
        return (n % 2 == 0) ? "CoffeeScript" : "Coffee";
      }
      return (n % 2 == 0) ? "JavaScript" : "Java";
    }
    return "mocha_missing!";
  }
}
