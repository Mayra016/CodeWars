import java.util.Arrays;

public class GrassHopper {
    
    public static int findAverage(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int quantity = (int) Arrays.stream(nums).count();
        return sum / quantity;
    }
}
