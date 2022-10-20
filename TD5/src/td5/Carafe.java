package td5;

import util.Keyboard;
/**
 * Classe pour gérer les carafes
 * 2 constructeurs, un vide, demandant les infos au clavier
 * un avec 2 entiers pour préciser contenu et capacité.
 * @author marceau
 * @param int co Le contenu (optionnel mais si présent ca doit aussi l'être)
 * @param int ca La capacité (optionnel mais si présent co doit aussi l'être)
 */
public class Carafe {
	private int contenu_, capacite_;
	
	/**
	 * Constructeur non-vide de la classe
	 * @param int co Contenu initial de la carafe
	 * @param int ca Capacité de la carafe (non modifiable)
	 * @throws Exception si capacité < contenu
	 */
	public Carafe(int co, int ca) throws Exception {  
		if (co <= ca) {
			contenu_ = co; capacite_ = ca;
		}
		else {
			throw new Exception("Trop de contenu!");
		}
		}
	
	/**
	 * Constructeur vide de la classe, demande des entrées au clavier
	 * @throws Exception si capacité < contenu
	 */
	public Carafe() throws Exception {Lire();}
	
	/**
	 * Nécessaire au constructeur vide pour l'initialisation des attributs
	 * @throws Exception si capacité < contenu
	 */
	
	private void Lire() throws Exception {
		int co = Keyboard.getInt("Entrez le contenu");
		int ca = Keyboard.getInt("Entrez la capacité");
		
		if (co <= ca) {
			contenu_ = co; capacite_ = ca;
		}
		else {
			throw new Exception("Trop de contenu!");
		}
		}
	
	/**
	 * Remplit la carafe de la quantité précisée, si possible
	 * @param int co la qantité précisée
	 */
	
	public void Remplir(int co) {
		if (contenu_ + co <= capacite_) {
			contenu_ += co;
		}
		else {
			System.out.println("Le remplissage excèderait la capacité de la carafe");
		}
	}
	
	/**
	 * Vide la carafe de la quantité précisée, si possible
	 * @param int co la qantité précisée
	 */
	
	public void Vider(int co) {
		if (contenu_ - co >= 0) {
			contenu_ -= co;
		}
		else {
			System.out.println("Il ne reste pas autant dans la carafe");
		}
	}
	
	/**
	 * Vide toute la carafe
	 */
	public void Vider() {
		contenu_ = 0;
	}
	
	/**
	 * Remplit toute la carafe
	 */
	public void Remplir() {
		contenu_ = capacite_;
	}
	
	/**
	 * Lecture du contenu
	 * @return int co Le contenu
	 */
	public int Contenu() {
		return contenu_;
	}
	
	/**
	 * Lecture de la capacité
	 * @return int ca La capacité
	 */
	public int Capacite() {
		return capacite_;
	}
	/**
	 * Permet de transvaser tout ce que l'on peut de la première à la seconde carafe
	 * @param Carafe c1 La première carafe
	 * @param Carafe c2 La seconde Carafe
	 */
	public static void Transvaser(Carafe c1, Carafe c2) {
		int cont1 = c1.Contenu();
		int cont2 = c2.Contenu();
		int cap2 = c2.Capacite();
		
		int maxTrans = cap2 - cont2;
		if (maxTrans > cont1) {
			c2.Remplir(cont1);
			c1.Vider();
		}
		else {
			c2.Remplir(maxTrans);
			c1.Vider(maxTrans);
		}
		
	}
	
	

}
