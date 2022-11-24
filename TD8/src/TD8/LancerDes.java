package TD8;

import java.util.ArrayList;

public class LancerDes {

	public static void main(String[] args) throws E421 {
		String nom = "TEST";
		Aleat a = new Aleat(6);
		
				
		do {
			ArrayList<Integer> al = a.lancerDes(nom);
			print(al);
		} while (true);
		

	}
	
	public static void print(Object o) {System.out.println(o);}


}



