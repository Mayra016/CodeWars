import java.util.List;
import java.util.ArrayList;

public class FilterList {
  
  public static List<Object> filterList(final List<Object> list) {
    List<Object> result = new ArrayList<>();
    
    for (Object object : list) {
      if (object instanceof Number) {
        result.add(object);
      }
    }
    
    return result;
  }
}
