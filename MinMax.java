import java.util.List;
import  java.util.Comparator;

class MinMax {
  static int[] getMinMax(List<Integer> list) {
    list.sort(Comparator.naturalOrder());
    return new int[] {list.get(0), list.get(list.size() - 1)};
  }
}
