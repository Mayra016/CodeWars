public class Find_average{
  public static double find_average(int[] array){
    int sum = 0;
    
    for (int element : array) {
      sum += element;
    }
    
    return (double) sum / array.length;
  }
}
