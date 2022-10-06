package conditions;

public class maximum {
	public static void main(String[] args) {
		int p1 = 10, p2 = 9, p3 = -1, p4 = 4, p5 = 8;
		//int p4;
		
		if (p1 > p2) {p4 = p1;}
		else {p4 = p2;}
		
		if (p3 > p4) {p4 = p3;}
		
		System.out.println(p4);
	}

}