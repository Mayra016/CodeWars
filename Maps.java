import java.util.Arrays;

public class Maps {
  public static int[] map(int[] arr) {
    return Arrays.stream(arr).map(n -> n = n * 2).toArray();
  }
}
