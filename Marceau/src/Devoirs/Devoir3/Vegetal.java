package Devoirs.Devoir3;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe Vegetal
 * Classe abstraite représentant un végétal
 * implémentant l'interface VegetalI
 * @author Marceau
 *
 * @see VegetalI
 */
public abstract class Vegetal implements VegetalI {
    private final String name;
    private int height = -1;
    private int weight = -1;
    private String color;
    private String type;
    private String description;
    private Seasons season;
    private String species;


    /**
     * Cpnstructeur exhaustif de la classe Vegetal
     * @param name Nom du végétal
     * @param height Hauteur du végétal
     * @param weight Poids du végétal
     * @param color Couleur du végétal
     * @param type Type du végétal
     * @param description Description du végétal
     * @param season Saison de départ
     * @param species Espèce du végétal
     */
    public Vegetal(String name, int height, int weight, String color, String type, String description, Seasons season, String species) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.color = color;
        this.type = type;
        this.description = description;
        this.season = season;
        this.species = species;
    }

    /**
     * Constructeur minimal de la classe Vegetal
     * @param name Nom du végétal
     */
    public Vegetal(String name) {
        this.name = name;
    }

    /**
     * Constructeur de la classe Vegetal
     * @param name Nom du végétal
     * @param type Type du végétal
     * @param species Espèce du végétal
     */
    public Vegetal(String name, String type, String species) {
        this.name = name;
        this.type = type;
        this.species = species;
    }

    /**
     * Constructeur de la classe Vegetal
     * @param name Nom du végétal
     * @param type Type du végétal
     * @param species Espèce du végétal
     * @param season Saison de départ
     */
    public Vegetal(String name, String type, String species, Seasons season) {
        this.name = name;
        this.type = type;
        this.species = species;
        this.season = season;
    }

    /**
     * Constructeur de la classe Vegetal
     * @param name Nom du végétal
     * @param type Type du végétal
     * @param species Espèce du végétal
     * @param season Saison de départ
     * @param description Description du végétal
     */
    public Vegetal(String name, String type, String species, Seasons season, String description) {
        this.name = name;
        this.type = type;
        this.species = species;
        this.season = season;
        this.description = description;
    }

    /**
     * Méthode pour définir la hauteur du végétal
     * @param height
     */
    protected void setHeight(int height) {
        this.height = height;
    }

    /**
     * Méthode pour définir le poids du végétal
     * @param weight
     */
    protected void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Méthode pour définir la couleur du végétal
     * @param color
     */
    protected void setColor(String color) {
        this.color = color;
    }

    /**
     * Méthode pour définir le type du végétal
     * @param type Type du végétal
     */
    protected void setType(String type) {
        this.type = type;
    }

    /**
     * Méthode pour définir la description du végétal
     * @param description Description du végétal
     */
    protected void setDescription(String description) {
        this.description = description;
    }

    /**
     * Méthode pour définir la saison du végétal
     * @param season Saison du végétal
     */
    protected void setSeason(Seasons season) {
        this.season = season;
    }

    /**
     * Méthode pour définir l'espèce du végétal
     * @param species Espèce du végétal
     */
    protected void setSpecies(String species) {
        this.species = species;
    }

    /**
     * Méthode pour récupérer le nom du végétal
     * @return Nom du végétal
     */
    public String getName() {
        return name;
    }

    /**
     * Méthode pour récupérer la hauteur du végétal
     * @return Hauteur du végétal
     */
    public int getHeight() {
        return height;
    }

    /**
     * Méthode pour récupérer le poids du végétal
     * @return Poids du végétal
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Méthode pour récupérer la couleur du végétal
     * @return Couleur du végétal
     */
    public String getColor() {
        return color;
    }

    /**
     * Méthode pour récupérer le type du végétal
     * @return Type du végétal
     */
    public String getType() {
        return type;
    }

    /**
     * Méthode pour récupérer la description du végétal
     * @return Description du végétal
     */
    public String getDescription() {
        return description;
    }

    /**
     * Méthode pour récupérer la saison du végétal
     * @return Saison du végétal
     */
    public Seasons getSeason() {
        return season;
    }

    /**
     * Méthode pour récupérer l'espèce du végétal
     * @return Espèce du végétal
     */
    public String getSpecies() {
        return species;
    }

    public String afficher() {
        String finalSrting = "Nom : " + this.getName() + "\n";
        if (this.getHeight() != -1) {
            finalSrting += "Hauteur : " + this.getHeight() + "m\n";
        }
        if (this.getWeight() != -1) {
            finalSrting += "Poids : " + this.getWeight() + "kg\n";
        }
        if (this.getColor() != null) {
            finalSrting += "Couleur : " + this.getColor() + "\n";
        }
        if (this.getType() != null) {
            finalSrting += "Type : " + this.getType() + "\n";
        }
        if (this.getDescription() != null) {
            finalSrting += "Description : " + this.getDescription() + "\n";
        }
        if (this.getSeason() != null) {
            finalSrting += "Saison : " + this.getSeason() + "\n";
        }
        if (this.getSpecies() != null) {
            finalSrting += "Espèce : " + this.getSpecies() + "\n";
        }
        return finalSrting;
    }


    /**
     * Méthode équivaut, qui permet de comparer deux objets de type Vegetal
     * @param vegetal le vegetal à comparer
     * @return true si les deux objets ont les mêmes attributs, false sinon
     */
    public List equivaut(Vegetal vegetal) {
        if (!this.getName().equals(vegetal.getName())) {
            return new ArrayList() {{
                add(false);
                add("Les espèces ne sont pas les mêmes");
        }};}

        if (this.getHeight() != vegetal.getHeight()) {
            return new ArrayList() {{
                add(false);
                add("Les hauteurs ne sont pas les mêmes");
        }};}

        if (this.getWeight() != vegetal.getWeight()) {
            return new ArrayList() {{
                add(false);
                add("Les poids ne sont pas les mêmes");
        }};}

        if (this.getType() != null) {
            if (!this.getType().equals(vegetal.getType())) {
                return new ArrayList() {{
                    add(false);
                    add("Les types ne sont pas les mêmes");
            }};}
        }

        if (this.getDescription() != null) {
            if (!this.getDescription().equals(vegetal.getDescription())) {
                return new ArrayList() {{
                    add(false);
                    add("Les descriptions ne sont pas les mêmes");
            }};}
        }

        if (this.getSeason() != null) {
            if (!this.getSeason().equals(vegetal.getSeason())) {
                return new ArrayList() {{
                    add(false);
                    add("Les saisons ne sont pas les mêmes");
            }};}
        }

        if (this.getSpecies() != null) {
            if (!this.getSpecies().equals(vegetal.getSpecies())) {
                return new ArrayList() {{
                    add(false);
                    add("Les espèces ne sont pas les mêmes");
            }};}
        }

        if (this.getColor() != null) {
            if (!this.getColor().equals(vegetal.getColor())) {
                return new ArrayList() {{
                    add(false);
                    add("Les couleurs ne sont pas les mêmes");
                }};}
        }

           return new ArrayList() {{
                add(true);
                add("Ces végetaux ont les mêmes caractéristiques");
            }};

    }

    /**
     * Méthode de changhement de saison
     * utilise l'Enum Seasons
     * @param n le nombre de saisons passer
     */
    public void changeSeason(int n) {
        this.setSeason(this.getSeason().suivante(n));
    }
    public void changeSeason() {
        this.setSeason(this.getSeason().suivante());
    }
}
