package Devoirs.Devoir5;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class E421 extends Exception {

	public E421(String nom, ArrayList<Integer> al) {
		super("Nom du lanceur : " + nom + "\nListe coupable :" + al);
	}

	public E421(ArrayList<Integer> al, String nom) {
		super("421 dans l'ordre ! C'est possible avec des dés ?!\nNom du lanceur : " + nom + "\nListe coupable :" + al);
	}
	

}
