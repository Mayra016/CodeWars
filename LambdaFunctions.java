import java.util.function.Function;

public class LambdaFunctions
{
	public static void main(String[] args) {
	    Function<Integer, Integer> doppel = ( a ) -> a * 2;
	    Function<String, String> greeting = ( name ) -> "Hello, " + name;
      Function<Boolean, Boolean> available = ( yes ) -> yes;
	}
}
