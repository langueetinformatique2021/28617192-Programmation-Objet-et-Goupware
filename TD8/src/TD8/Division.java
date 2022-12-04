package TD8;

public class Division {

	public static void main(String[] args) {
		try {
		int i = 1000, j;
		do {i--; j = 1/i;} while (true); //Division par 0
	}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		
	}

}
