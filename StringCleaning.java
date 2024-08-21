import java.util.Arrays;
import java.util.stream.Collectors;

class StringCleaning {
    static String stringClean(final String text) {
        int[] nums = {0,1,2,3,4,5,6,7,8,9};

        String result = text.chars()
                            .filter(c -> Arrays.binarySearch(nums, Character.getNumericValue(c)) < 0)
                            .mapToObj(c -> String.valueOf((char) c))
                            .collect(Collectors.joining());

      
        return result;
    }
}
