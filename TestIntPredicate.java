import java.util.function.IntPredicate;

public class TestIntPredicate {
    public static boolean testFunctions(int[] list, IntPredicate predicate){
        if (list.length < 1) {
          return true;
        }
      
        for (int i = 0; i < list.length; i++) {
          if (!predicate.test(list[i])) {
            return false;
          }
        }
      
        return true;
    }
}
