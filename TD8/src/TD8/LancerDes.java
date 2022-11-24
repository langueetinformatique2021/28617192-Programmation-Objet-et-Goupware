package TD8;

import java.util.ArrayList;

public class LancerDes {

	public static void main(String[] args) throws E421 {
		String nom = "TEST";
		Aleat a = new Aleat(6);
		
				
		do {
			ArrayList al = a.lancerDes();
			print(al);
			test421(al, nom);
		} while (true);
		

	}
	
	public static void print(Object o) {System.out.println(o);}
	public static void test421(ArrayList<Integer> al, String nom) throws E421 {
		if (al.contains(4)) if (al.contains(2)) if (al.contains(1)) throw new E421(nom);
		}

}



