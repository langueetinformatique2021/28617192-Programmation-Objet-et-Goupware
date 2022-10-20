package td5;

public class Fete14 {

	public static void main(String[] args) {
		Date today = new Date(20, 10, 2022);
		Date fete14 = new Date(14, 7, 2023);

		int i = 0;
		while (today.CompareTo(fete14)) {
			today.Incrementer();
			i++;
		}
		
		System.out.println(i);

	}

}
