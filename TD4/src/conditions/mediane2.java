package conditions;

public class mediane2 {
	public static void main(String[] args) {
		int p1 = 10, p2 = 9, p3 = -1, p4 = 4, p5 = 8;
		int p6;
		
		
		if (p1 < p2) {
			if (p1 < p3) {
				if (p1 > p4) {
					if (p1 > p5) p6 = p1;
					else p6 = p5; 
				}
				else {
					if (p4 > p5) p6 = p4;
					else p6 = p5; 				}
			}
			else {
				if (p3 > p4) {
					if (p3 > p5) p6 = p3;
					else p6 = p5; 
				}
				else {
					if (p4 > p5) p6 = p4;
					else p6 = p5; 	
				}
			}
		}
		else {
			if (p2 < p3) {
				if (p2 > p4) {
					if (p2 > p5) p6 = p2;
					else p6 = p5; 
				}
				else {
					if (p4 > p5) p6 = p4;
					else p6 = p5; 				}
			}
			else {
				if (p3 > p4) {
					if (p3 > p5) p6 = p3;
					else p6 = p5; 
				}
				else {
					if (p4 > p5) p6 = p4;
					else p6 = p5; 	
				}
			}
		}
		
		
		System.out.println(p6);
	}

}