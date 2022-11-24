package TD8;

import java.util.ArrayList;

public class E421 extends Exception {

	public E421(String nom, ArrayList<Integer> al) {
		super("Nom du lanceur : " + nom + "\nListe coupable :" + al);
	}
	

}
