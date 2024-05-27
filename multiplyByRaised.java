public class MultiplyByRaised {
  public static int multiply(int number) {
    int raisedNum = (int) Math.pow(5, String.valueOf(number).replace("-", "").length());
    
    return number * raisedNum;
  }
}
