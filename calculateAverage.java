public class CalculateAverage{
  public static double find_average(int[] array){
    double sum = 0;
    for (int num : array) {
      sum += num;
    }
    
    return sum / array.length;
  }
}
