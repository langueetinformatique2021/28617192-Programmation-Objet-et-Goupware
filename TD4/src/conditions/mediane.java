package conditions;

public class mediane {
	public static void main(String[] args) {
		int p1 = 10, p2 = 9, p3 = -1, p4 = 4, p5 = 8;
		int initiale = p4;
		
		if (p1 < p2) {
			if (p1 > p3) {
				p4 = p1;
			}
		}
		else {
			if (p2 > p3) {
				p4 = p2;
			}
		}
		if (p4 == initiale) p4 = p3;
		
		System.out.println(p4);
	}

}