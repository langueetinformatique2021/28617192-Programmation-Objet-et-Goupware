package TD8;

import java.util.ArrayList;

public class LancerDes extends Aleat {
	
	String nom = "TEST";
	int faces = 6;
	
	public LancerDes(String nom, int faces) {
		super(faces);
		this.faces = faces;
		this.nom = nom;
	}
	
	public ArrayList<Integer> lancerDes() throws E421 {
		ArrayList<Integer> list = new ArrayList<>();
		int i = 0;
		do {
			i++;
			list.add(this.get());
		} while (i < 3);
		this.test421(list, nom);
		return list;
	}
	
	private void test421(ArrayList<Integer> al, String nom) throws E421 {
		if (al.contains(4)) if (al.contains(2)) if (al.contains(1)) throw new E421(nom, al);
		}



}



