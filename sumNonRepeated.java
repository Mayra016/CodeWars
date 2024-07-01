import java.util.Arrays;

public class SumNonRepeated {
    public static int sumNoDuplicates(int[] arr) {
        Arrays.sort(arr);
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                // Skip duplicate elements
                while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                    i++;
                }
            } else {
                sum += arr[i];
            }
        }
        
        return sum;
    }
}
