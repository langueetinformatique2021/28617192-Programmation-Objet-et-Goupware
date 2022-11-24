package TD8;

/** Générateur de nombres entiers naturels aleatoires
 * @author montacie
 */
public class Aleat {
	
	private int maximum;
	
	/** instanciation 
	 * @param maximum nombre maximum généré 
	 */
	public Aleat(int maximum) {
		this.maximum = maximum;
	}

	/** 
	 * Méthode retournant un entier aléatiore à partir du maximum de l'instance de la classe
	 * @return nombre aleatoire 
	 */
	public int get() {
		return (int)(Math.random() * this.maximum) + 1;
	}
}