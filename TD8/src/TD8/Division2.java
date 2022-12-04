package TD8;

public class Division2 {
	public static void main(String[] args) {
		try {
			division();
		} catch (ArithmeticException e) {
			System.out.println("Division par 0 !");
			System.out.println(e);
		}
	}
	
	@SuppressWarnings("unused")
	public static void division() throws ArithmeticException {
		int i = 1000, j;
		do {i--; j = 1 / i;} while (true);
	}

}