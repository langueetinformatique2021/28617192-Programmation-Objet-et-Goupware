package TDs.TD8;

public class PileFace {
	public static void main(String[] args) {
		Aleat a = new Aleat(2);
		
		print(tire(a));
				
		int i = 0, j = 0;
		double n = 1000.0;
		do {i ++; j += tire(a);} while (i < n);
		print(j / n);
	}
	
	
	public static void print(Object o) {System.out.println(o);}
	public static int tire(Aleat a) {
		return (a.get() > 1) ?  1 : 0;
	}
} 
