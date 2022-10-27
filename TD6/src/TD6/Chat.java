package TD6;

public class Chat extends Felin {
	public Chat(String type) {
		super(type);
	}

	/** gestion de l'état de domestication d'un animal */
	
	public interface Domesticable {
		String nom = null;
		
		/** Domestiquer un animal et lui donner un nom
		* @param nom nom de l'animal */
		public default void domestiquer(String nom_) {
			Domesticable.nom = nom_;
		}
		
		/** Rend le nom de l'animal
		* @return nom de l'animal */
		public default String nom() {
			return Domesticable.nom;
		}
	} 
}
