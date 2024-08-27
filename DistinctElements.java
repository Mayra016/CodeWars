import java.util.ArrayList;
import java.util.List;

public class DistinctElements {
  public static int[] distinct(int[] array){
      List<Integer> elements = new ArrayList<>();
    
      for (int num : array) {
        if (!elements.contains(num)) {
          elements.add(num);
        }
      }
    
      return elements.stream().mapToInt(Integer::intValue).toArray();
  }
}
