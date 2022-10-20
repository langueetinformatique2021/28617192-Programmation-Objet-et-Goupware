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
	
	public int Contenu() {
		return contenu_;
	}
	
	public int Capacite() {
		return capacite_;
	}

}
