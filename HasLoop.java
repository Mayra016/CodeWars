import java.util.HashSet;
import java.util.Set;

public class HasLoop {
    public static boolean hasLoop(int[] arr) {
        Set<Integer> visited = new HashSet<>();
        int index = 0;

        while (index >= 0 && index < arr.length) {
            if (visited.contains(index)) {
                return true; // Schleife entdeckt
            }
            visited.add(index);
            index = arr[index];
        }

        return false; // raus aus dem Array → keine Schleife
    }
}
