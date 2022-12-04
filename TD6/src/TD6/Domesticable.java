package TD6;

public interface Domesticable {
	
	/** Domestiquer un animal et lui donner un nom
	* @param nom nom de l'animal */
	public void domestiquer(String nom_);
	
	/** Rend le nom de l'animal
	* @return nom de l'animal */
	public String nom() ;
} 