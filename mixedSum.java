import java.util.List;

public class MixedSum {

 /*
  * Assume input will be only of Integer o String type
  */
	public int sum(List<?> mixed) {	
    int sum = 0;
    int number = 0;
    
    for (int i = 0; i < mixed.size(); i++) {
      if (mixed.get(i) instanceof String) {
        number = Integer.valueOf((String) mixed.get(i));
      }
      
      if (mixed.get(i) instanceof Integer) {
        number = (int) mixed.get(i);
      }
      sum += number;
    }
		return sum;
	}
}
