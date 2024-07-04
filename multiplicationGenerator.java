public class MultiplicationGenerator {

	private final int a;
	private int num = 0;

	private Generator(int a) {
		this.a = a;
	}

	public static Generator of(int a) {
		return new Generator( a );
	}

	public String next() {
		num = num + 1;
    return String.valueOf(a) + " x " + String.valueOf(num) + " = " + String.valueOf(a * num);
	}
}
