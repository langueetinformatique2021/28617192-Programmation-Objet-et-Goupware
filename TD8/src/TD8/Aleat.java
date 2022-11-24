package TD8;

import java.util.ArrayList;
import java.util.List;

/** Générateur de nombres entiers naturels aleatoires
 * @author montacie
 */
public class Aleat {
	/**Le maximum défini lors de l'instanciation*/
	private int maximum;
	
	/** 
	 * Constructeur de la classe, prend un entier en entrée
	 * @param maximum nombre maximum généré 
	 */
	public Aleat(int maximum) {
		this.maximum = maximum;
	}

	/** 
	 * Méthode retournant un entier aléatiore à partir du maximum de l'instance de la classe
	 * @return nombre aleatoire compris entre 0 et le maximum
	 */
	public int get() {
		return (int)(Math.random() * this.maximum) + 1;
	}
	
	public ArrayList<Integer> lancerDes(String nom) throws E421 {
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