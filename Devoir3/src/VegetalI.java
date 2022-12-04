/**
 * Interface VegetalI
 * @author Marceau
 * @see Vegetal
 */
public interface VegetalI {

    /**
     * Méthode à impélmenter
     * Permet de faire pousser le végétal
     * @param n un entier relatif a l'importance de la croissance
     */
    public void pousse(n int);

    /**
     * Méthode à impélmenter
     * Permet de changer la couleur du végétal
     * @param color
     */
    public void changeColor(String color);

    /**
     * Méthode à impélmenter
     * Permet de changer de saison (printemps, été, automne, hiver)
     * @param n Nombre de saisons à changer
     */
    public void changeSeason(int n);

    /**
     * Méthode à impélmenter
     * Permet de savoir si le végétal est en fleur ou non
     * @return true si le végétal est en fleur, false sinon
     */
    public String fleurit();
}
