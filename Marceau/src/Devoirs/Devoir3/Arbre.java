package Devoirs.Devoir3;
/**
 * Classe Arbre
 * Dérivée de Vegetal
 * Classe non abstraite qui implémente les méthodes abstraites de Vegetal et VegetalI
 * @author Marceau
 * @see Vegetal
 * @see VegetalI
 */
public class Arbre extends Vegetal {

    /**
     * Constructeur simple de la classe Arbre
     * appelant le constructeur de Vegetal en lui passant les paramètres
     * le type est défini à "Arbre"
     * @param name Nom de l'arbre
     * @param species Espèce de l'arbre
     */
    public Arbre(String name, String species) {
        super(name, "Arbre", species);
    }

    /**
     * Constructeur de la classe Arbre
     * appelant le constructeur de Vegetal en lui passant les paramètres
     * le type est défini à "Arbre"
     * @param name Nom de l'arbre
     * @param season Saison de départ
     * @param species Espèce de l'arbre
     */
    public Arbre(String name, String species, Seasons season) {
        super(name, "Arbre", species, season);
    }

    /**
     * Constructeur de la classe Arbre
     * appelant le constructeur de Vegetal en lui passant les paramètres
     * le type est défini à "Arbre"
     * @param name Nom de l'arbre
     * @param species Espèce de l'arbre
     * @param season Saison de départ
     * @param description Description de l'arbre
     */
    public Arbre(String name, String species, Seasons season, String description) {
        super(name, "Arbre", species, season, description);
    }

    /**
     * Constructeur de la classe Arbre
     * appelant le constructeur de Vegetal en lui passant les paramètres
     * le type est défini à "Arbre"
     * @param name Nom de l'arbre
     * @param species Espèce de l'arbre
     * @param season Saison de départ
     * @param description Description de l'arbre
     * @param color Couleur de l'arbre
     */
    public Arbre(String name, String species, Seasons season, String description, int height, int weight, String color) {
        super(name, "Arbre", species, season, description);
        this.setHeight(height);
        this.setWeight(weight);
        this.setColor(color);
    }



    /** Méthode pousse
     * augmente la hauteur de l'arbre de n
     * @param height Hauteur à ajouter
     */
    public void pousse(int height) {
        this.setHeight(this.getHeight() + height);
    }

    /**
     * Surcharge de la méthode pousse
     * augmente la hauteur de l'arbre de 1
     */
    public void pousse() {
        this.pousse(1);
    }

    /**
     * Méthode changeColor
     * change la couleur de l'arbre
     * @param color Nouvelle couleur
     */
    public void changeColor(String color) {
        this.setColor(color);
    }

    /**
     * Méthode fleurit
     * @return String "Je fleuris"
     */
    public String fleurit() {
        return "Je fleuris";
    }

}
