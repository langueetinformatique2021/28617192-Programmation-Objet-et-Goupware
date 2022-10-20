package td5;

import util.Keyboard;

public class Carafe {
	private int contenu_, capacite_;
	
	public Carafe(int co, int ca) {  
		contenu_ = co; capacite_ = ca;
		}
	public Carafe() {Lire();}
	
	private void Lire() {
		contenu_ = Keyboard.getInt("Entrez le jour");
		capacite_ = Keyboard.getInt("Entrez le mois");
		}
	
	public void Remplir(int co) {
		if (contenu_ + co <= capacite_) {
			contenu_ += co;
		}
		else {
			System.out.println("Le remplissage excèderait la capacité de la carafe");
		}
	}
	
	public void Vider(int co) {
		if (contenu_ - co >= 0) {
			contenu_ -= co;
		}
		else {
			System.out.println("Il ne reste pas autant dans la carafe");
		}
	}
	
	public void Vider() {
		contenu_ = 0;
	}
	
	public void Remplir() {
		contenu_ = capacite_;
	}
	
	public int Contenu() {
		return contenu_;
	}
	
	public int Capacite() {
		return capacite_;
	}
	
	public void Transvaser(Carafe c1, Carafe c2) {
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
