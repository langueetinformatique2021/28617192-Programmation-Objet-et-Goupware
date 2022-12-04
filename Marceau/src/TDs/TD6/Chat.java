package TDs.TD6;

public class Chat extends Felin implements Domesticable {
	private String nom;
	
	public Chat() {
		super("Chat");
	}
	
	public Chat(String type) {
		super(type);
	}
	
	public void crie() {
		if (domestique) {
			System.out.println("Je m'appelle '" + nom + "' miaou");
		}
		else {
			super.crie();
		}
	}
	
	public void domestiquer(String nom_) {
		domestique = true;
		nom = nom_;
	}
	
	public String nom() {
		return nom;
	}
}
