import java.util.function.Function;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class StreamMethods
{
	public static void main(String[] args) {
	    List<Integer> nums = new ArrayList<>();
	    List<Integer> nums2 = new ArrayList<>();
	    
	    for (int i = 0; i < 6; i++) {
	        nums.add(i);
	    }
	    
	    int result = (int) nums.stream().filter(n -> n % 2 == 0 && n != 0).count();
	    System.out.println(result);
	    System.out.println(nums.stream().findFirst());
	    nums2 = nums.stream().map(n -> n * 2).collect(Collectors.toList());
	    nums2.stream().sorted(Comparator.reverseOrder()).forEach(n -> System.out.println(n));
	    nums2.stream().forEach(n -> System.out.println(n));
	}
}
