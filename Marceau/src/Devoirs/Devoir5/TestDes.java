package Devoirs.Devoir5;

import java.util.ArrayList;

public class TestDes {

	public static void main(String[] args) throws E421 {
		String nom = "TEST";
		LancerDes ld = new LancerDes(nom, 6);
		
		do {
			ArrayList<Integer> al = ld.lancerDes();
			print(al);
		} while (true);
	}
		
	public static void print(Object o) {System.out.println(o);}
}
