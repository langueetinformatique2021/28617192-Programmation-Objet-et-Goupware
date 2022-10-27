package TD6;

public class Chat extends Felin implements Domesticable {
	String nom = null;
	
	public Chat(String type) {
		super(type);
	}
	
	public void crie() {
		System.out.println("Miaou");
	}
	
	public void domestiquer(String nom_) {
		domestique = true;
		nom = nom_;
	}
	
	public String nom() {
		return nom;
	}
}
